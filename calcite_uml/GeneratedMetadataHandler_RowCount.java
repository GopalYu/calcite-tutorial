// provider0 RelMdRowCount

public final class GeneratedMetadataHandler_RowCount implements org.apache.calcite.rel.metadata.BuiltInMetadata.RowCount.Handler {
  private final java.util.List relClasses;
  public final org.apache.calcite.rel.metadata.RelMdRowCount provider0;
  public GeneratedMetadataHandler_RowCount(java.util.List relClasses,
      org.apache.calcite.rel.metadata.RelMdRowCount provider0) {
    this.relClasses = relClasses;
    this.provider0 = provider0;
  }
  public org.apache.calcite.rel.metadata.MetadataDef getDef() {
    return org.apache.calcite.rel.metadata.BuiltInMetadata$RowCount.DEF;
  }
  public java.lang.Double getRowCount(
      org.apache.calcite.rel.RelNode r,
      org.apache.calcite.rel.metadata.RelMetadataQuery mq) {
    final java.util.List key = org.apache.calcite.runtime.FlatLists.of(org.apache.calcite.rel.metadata.BuiltInMetadata$RowCount.DEF);
    final Object v = mq.map.get(r, key);
    if (v != null) {
      if (v == org.apache.calcite.rel.metadata.NullSentinel.ACTIVE) {
        throw new org.apache.calcite.rel.metadata.CyclicMetadataException();
      }
      if (v == org.apache.calcite.rel.metadata.NullSentinel.INSTANCE) {
        return null;
      }
      return (java.lang.Double) v;
    }
    mq.map.put(r, key,org.apache.calcite.rel.metadata.NullSentinel.ACTIVE);
    try {
      final java.lang.Double x = getRowCount_(r, mq);
      mq.map.put(r, key, org.apache.calcite.rel.metadata.NullSentinel.mask(x));
      return x;
    } catch (java.lang.Exception e) {
      mq.map.row(r).clear();
      throw e;
    }
  }

  private java.lang.Double getRowCount_(
      org.apache.calcite.rel.RelNode r,
      org.apache.calcite.rel.metadata.RelMetadataQuery mq) {
    switch (relClasses.indexOf(r.getClass())) {
    default:
      return provider0.getRowCount((org.apache.calcite.rel.RelNode) r, mq);
    case 2:
      return provider0.getRowCount((org.apache.calcite.plan.volcano.RelSubset) r, mq);
    case 3:
      return getRowCount(((org.apache.calcite.plan.hep.HepRelVertex) r).getCurrentRel(), mq);
    case 4:
    case 5:
    case 21:
    case 22:
    case 23:
    case 29:
    case 45:
    case 46:
    case 47:
    case 51:
      return provider0.getRowCount((org.apache.calcite.rel.SingleRel) r, mq);
    case 6:
    case 24:
    case 30:
      return provider0.getRowCount((org.apache.calcite.rel.core.Aggregate) r, mq);
    case 7:
    case 31:
      return provider0.getRowCount((org.apache.calcite.rel.core.Calc) r, mq);
    case 9:
    case 33:
      return provider0.getRowCount((org.apache.calcite.rel.core.Exchange) r, mq);
    case 10:
    case 25:
    case 34:
      return provider0.getRowCount((org.apache.calcite.rel.core.Filter) r, mq);
    case 11:
    case 35:
      return provider0.getRowCount((org.apache.calcite.rel.core.Intersect) r, mq);
    case 12:
    case 27:
    case 36:
      return provider0.getRowCount((org.apache.calcite.rel.core.Join) r, mq);
    case 13:
    case 37:
      return provider0.getRowCount((org.apache.calcite.rel.core.Minus) r, mq);
    case 14:
    case 26:
    case 38:
      return provider0.getRowCount((org.apache.calcite.rel.core.Project) r, mq);
    case 15:
    case 39:
      return provider0.getRowCount((org.apache.calcite.rel.core.Sort) r, mq);
    case 17:
    case 41:
      return provider0.getRowCount((org.apache.calcite.rel.core.TableModify) r, mq);
    case 18:
    case 28:
    case 42:
    case 50:
      return provider0.getRowCount((org.apache.calcite.rel.core.TableScan) r, mq);
    case 19:
    case 43:
      return provider0.getRowCount((org.apache.calcite.rel.core.Union) r, mq);
    case 20:
    case 44:
      return provider0.getRowCount((org.apache.calcite.rel.core.Values) r, mq);
    case -1:
      throw new org.apache.calcite.rel.metadata.JaninoRelMetadataProvider$NoHandler(r.getClass());
    }
  }

}
