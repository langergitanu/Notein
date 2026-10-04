package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz8O {
    private zz8N zzZ5d;
    private zzHY zzZ5e;
    private zz9B zzZ5f;

    public zz8O(zz9B zz9b, zzHY zzhy, zz8N zz8n) {
        this.zzZ5f = zz9b;
        this.zzZ5e = zzhy;
        this.zzZ5d = zz8n;
    }

    private boolean zzX(zz8O zz8o) {
        return com.aspose.words.internal.zzZKO.equals(this.zzZ5f, zz8o.zzZ5f) && com.aspose.words.internal.zzZKO.equals(this.zzZ5e, zz8o.zzZ5e) && com.aspose.words.internal.zzZKO.equals(this.zzZ5d, zz8o.zzZ5d);
    }

    public final boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zz8O.class) {
            return false;
        }
        return zzX((zz8O) obj);
    }

    public final int hashCode() {
        zz9B zz9b = this.zzZ5f;
        int iHashCode = (zz9b != null ? zz9b.hashCode() : 0) * 397;
        zzHY zzhy = this.zzZ5e;
        int iHashCode2 = (iHashCode ^ (zzhy != null ? zzhy.hashCode() : 0)) * 397;
        zz8N zz8n = this.zzZ5d;
        return iHashCode2 ^ (zz8n != null ? zz8n.hashCode() : 0);
    }
}
