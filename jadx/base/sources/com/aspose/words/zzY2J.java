package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2J implements zzZ94 {
    private Shape zzZ2R;

    public zzY2J(Shape shape) {
        this.zzZ2R = shape;
    }

    private Object zzPj(int i) {
        return this.zzZ2R.fetchShapeAttr(i);
    }

    private void zzQ(int i, Object obj) {
        this.zzZ2R.setShapeAttr(i, obj);
    }

    @Override // com.aspose.words.zzZ94
    public final int getDashStyle() {
        return ((Integer) zzPj(462)).intValue();
    }

    @Override // com.aspose.words.zzZ94
    public final int getEndArrowLength() {
        return ((Integer) zzPj(469)).intValue();
    }

    @Override // com.aspose.words.zzZ94
    public final int getEndArrowType() {
        return ((Integer) zzPj(465)).intValue();
    }

    @Override // com.aspose.words.zzZ94
    public final int getEndArrowWidth() {
        return ((Integer) zzPj(468)).intValue();
    }

    @Override // com.aspose.words.zzZ94
    public final int getEndCap() {
        return ((Integer) zzPj(471)).intValue();
    }

    @Override // com.aspose.words.zzZ94
    public final byte[] getImageBytes() {
        return (byte[]) zzPj(4111);
    }

    @Override // com.aspose.words.zzZ94
    public final int getJoinStyle() {
        return ((Integer) zzPj(470)).intValue();
    }

    @Override // com.aspose.words.zzZ94
    public final int getLineFillType() {
        return ((Integer) zzPj(452)).intValue();
    }

    @Override // com.aspose.words.zzZ94
    public final int getLineStyle() {
        return ((Integer) zzPj(461)).intValue();
    }

    @Override // com.aspose.words.zzZ94
    public final boolean getOn() {
        return ((Boolean) zzPj(508)).booleanValue() && ((Boolean) zzPj(380)).booleanValue();
    }

    @Override // com.aspose.words.zzZ94
    public final double getOpacity() {
        return ((double) ((Integer) zzPj(449)).intValue()) / 65536.0d;
    }

    @Override // com.aspose.words.zzZ94
    public final int getStartArrowLength() {
        return ((Integer) zzPj(467)).intValue();
    }

    @Override // com.aspose.words.zzZ94
    public final int getStartArrowType() {
        return ((Integer) zzPj(464)).intValue();
    }

    @Override // com.aspose.words.zzZ94
    public final int getStartArrowWidth() {
        return ((Integer) zzPj(466)).intValue();
    }

    @Override // com.aspose.words.zzZ94
    public final zz7X getStrokeFill() {
        return null;
    }

    @Override // com.aspose.words.zzZ94
    public final double getWeight() {
        return ((double) ((Integer) zzPj(459)).intValue()) / 12700.0d;
    }

    @Override // com.aspose.words.zzZ94
    public final void setDashStyle(int i) {
        zzQ(462, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZ94
    public final void setEndArrowLength(int i) {
        zzQ(469, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZ94
    public final void setEndArrowType(int i) {
        zzQ(465, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZ94
    public final void setEndArrowWidth(int i) {
        zzQ(468, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZ94
    public final void setEndCap(int i) {
        zzQ(471, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZ94
    public final void setJoinStyle(int i) {
        zzQ(470, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZ94
    public final void setLineFillType(int i) {
        zzQ(452, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZ94
    public final void setLineStyle(int i) {
        zzQ(461, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZ94
    public final void setOn(boolean z) {
        zzQ(508, Boolean.valueOf(z));
        zzQ(380, Boolean.valueOf(z));
    }

    @Override // com.aspose.words.zzZ94
    public final void setOpacity(double d) {
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        zzQ(449, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(d)));
    }

    @Override // com.aspose.words.zzZ94
    public final void setStartArrowLength(int i) {
        zzQ(467, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZ94
    public final void setStartArrowType(int i) {
        zzQ(464, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZ94
    public final void setStartArrowWidth(int i) {
        zzQ(466, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZ94
    public final void setStrokeFill(zz7X zz7x) {
        throw new IllegalStateException("Object doesn't support this action.");
    }

    @Override // com.aspose.words.zzZ94
    public final void setWeight(double d) {
        if (d < 0.0d) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        zzQ(459, Integer.valueOf(com.aspose.words.internal.zzSA.zzp(d)));
    }

    @Override // com.aspose.words.zzZ94
    public final com.aspose.words.internal.zzPV zz8Q() {
        return (com.aspose.words.internal.zzPV) zzPj(448);
    }

    @Override // com.aspose.words.zzZ94
    public final com.aspose.words.internal.zzPV zzZBx() {
        return (com.aspose.words.internal.zzPV) zzPj(450);
    }

    @Override // com.aspose.words.zzZ94
    public final com.aspose.words.internal.zzPV zzZBy() {
        return zz8Q();
    }

    @Override // com.aspose.words.zzZ94
    public final void zzi(com.aspose.words.internal.zzPV zzpv) {
        zzQ(450, zzpv);
    }

    @Override // com.aspose.words.zzZ94
    public final void zzm(com.aspose.words.internal.zzPV zzpv) {
        zzQ(448, zzpv);
    }
}
