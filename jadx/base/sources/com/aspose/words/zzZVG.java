package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZVG implements zzZAN {
    private ShapeBase zzZ7Z;

    public zzZVG(ShapeBase shapeBase) {
        this.zzZ7Z = shapeBase;
    }

    private zzH0 zzZjS() throws Exception {
        zzH0 zzh0ZzZwy = zzZwy();
        if (zzh0ZzZwy != null) {
            return zzh0ZzZwy;
        }
        zz3V zz3v = (zz3V) com.aspose.words.internal.zzZKW.zzZ(this.zzZ7Z.zzY9i(), zz3V.class);
        if (zz3v != null) {
            zz3v.zzZ(new zzH0());
        }
        zz7S zz7s = (zz7S) com.aspose.words.internal.zzZKW.zzZ(this.zzZ7Z.zzY9i(), zz7S.class);
        if (zz7s != null) {
            zz7s.setFill(new zzH0());
        }
        return zzZwy();
    }

    private zzH0 zzZwy() throws Exception {
        zzH0 zzh0ZzZwy;
        byte[] bArrZzZQa;
        zz7S zz7s = (zz7S) com.aspose.words.internal.zzZKW.zzZ(this.zzZ7Z.zzY9i(), zz7S.class);
        if (zz7s != null) {
            zz3V zz3v = (zz3V) com.aspose.words.internal.zzZKW.zzZ(this.zzZ7Z.zzY9i(), zz3V.class);
            zzh0ZzZwy = zz3v != null ? zz3v.zzZwy() : (zzH0) com.aspose.words.internal.zzZKW.zzZ(zz7s.getFill(), zzH0.class);
        } else {
            zzh0ZzZwy = null;
        }
        if (zzh0ZzZwy != null && (bArrZzZQa = zzh0ZzZwy.zzZQ1().zzZQa()) != null && com.aspose.words.internal.zzEF.zzZP(bArrZzZQa)) {
            zzh0ZzZwy.zzZQ1().zzYt(zzZ8K.zzZW(bArrZzZQa));
        }
        return zzh0ZzZwy;
    }

    @Override // com.aspose.words.zzZAN
    public final byte[] getImageBytes() throws Exception {
        zzH0 zzh0ZzZwy = zzZwy();
        if (zzh0ZzZwy == null) {
            return null;
        }
        return zzh0ZzZwy.zzZQ1().zzZQa();
    }

    @Override // com.aspose.words.zzZAN
    public final String getSourceFullName() throws Exception {
        zzH0 zzh0ZzZwy = zzZwy();
        if (zzh0ZzZwy == null) {
            return null;
        }
        return zzh0ZzZwy.zzZQ1().zzZQ9();
    }

    @Override // com.aspose.words.zzZAN
    public final void setImageBytes(byte[] bArr) throws Exception {
        zzH0 zzh0ZzZjS = zzZjS();
        if (zzh0ZzZjS != null) {
            zzh0ZzZjS.zzZQ1().zzYt(bArr);
        }
        if (this.zzZ7Z.zzY9n() == null || !this.zzZ7Z.zzY9n().canHaveImage()) {
            return;
        }
        this.zzZ7Z.zzY9n().setShapeAttr(4102, zzZ8K.zzZW(bArr));
    }

    @Override // com.aspose.words.zzZAN
    public final void setSourceFullName(String str) throws Exception {
        zzH0 zzh0ZzZwy = zzZwy();
        if (zzh0ZzZwy == null) {
            return;
        }
        zzh0ZzZwy.zzZQ1().zzRE(str);
    }

    @Override // com.aspose.words.zzZAN
    public final boolean zzZjT() throws Exception {
        zzH0 zzh0ZzZwy = zzZwy();
        if (zzh0ZzZwy == null || zzh0ZzZwy.zzZQ1() == null) {
            return false;
        }
        return zzh0ZzZwy.zzZQ1().zzZQb();
    }
}
