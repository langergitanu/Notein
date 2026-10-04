package com.aspose.words.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ6H {
    zzZAP zzWFl;
    private Map zzWn1;
    zzZ62 zzWn2;
    zzZ6D zzWn3;
    zzZAJ zzWn4;
    private static final zzZ6E zzWn6 = zzZ6E.zzWmz;
    private static final zzYHJ zzWn5 = new zzYHJ();

    private zzZ6H(zzZ6H zzz6h) {
        this.zzWn4 = zzz6h.zzWn4;
        this.zzWFl = zzz6h.zzWFl;
        this.zzWn3 = zzz6h.zzWn3;
        this.zzWn2 = zzz6h.zzWn2;
    }

    private zzZAJ zzXHm() throws zzZ6M {
        try {
            return zzZAJ.zzY8(this.zzWFl.zzXJV());
        } catch (ClassCastException e) {
            throw new zzZ6M("Malformed content.", e);
        } catch (IllegalArgumentException e2) {
            throw new zzZ6M("Malformed content.", e2);
        }
    }

    public static zzZ6H zzZ(zzZ6H zzz6h, zzZ62 zzz62) {
        zzZ6H zzz6h2 = new zzZ6H(zzz6h);
        zzz6h2.zzWn2 = zzz62;
        HashSet hashSet = new HashSet();
        zzZDJ zzzdj = new zzZDJ();
        for (zzZ63 zzz63 : zzz62.zzXH9()) {
            zzZ6C.zzZ(hashSet, zzz63, zzWn5);
            zzzdj.zzZ(zzz63.zzXHa());
        }
        zzZD2 zzzd2ZzX = zzZ6C.zzX(hashSet);
        zzZBM zzzbm = new zzZBM(zzzdj);
        zzZD4 zzzd4 = (zzZD4) zzz6h.zzWn4.zzXL0();
        zzZDJ zzzdj2 = new zzZDJ();
        zzzdj2.zzZ(zzzd4.zzg6(0));
        zzzdj2.zzZ(zzzd2ZzX);
        for (int i = 2; i != zzzd4.size() - 1; i++) {
            zzzdj2.zzZ(zzzd4.zzg6(i));
        }
        zzzdj2.zzZ(zzzbm);
        zzz6h2.zzWn4 = zzZAJ.zzY8(new zzZCP(zzzdj2));
        zzz6h2.zzWFl = new zzZAP(zzz6h2.zzWFl.zzXJW(), zzz6h2.zzWn4);
        return zzz6h2;
    }

    public final byte[] getEncoded() throws IOException {
        return this.zzWFl.getEncoded();
    }

    public final zzZAP zzXHi() {
        return this.zzWFl;
    }

    public final zzZ6D zzXHj() {
        return this.zzWn3;
    }

    public final String zzXHk() {
        return this.zzWn4.zzXJN().zzXJW().getId();
    }

    public final zzZ62 zzXHl() {
        Map map;
        Object objZzXJk;
        if (this.zzWn2 == null) {
            zzZD2 zzzd2ZzXJM = this.zzWn4.zzXJM();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != zzzd2ZzXJM.size(); i++) {
                zzZAG zzzagZzY5 = zzZAG.zzY5(zzzd2ZzXJM.zzg6(i));
                zzZDA zzzdaZzXJW = this.zzWn4.zzXJN().zzXJW();
                Map map2 = this.zzWn1;
                if (map2 == null) {
                    arrayList.add(new zzZ63(zzzagZzY5, zzzdaZzXJW, this.zzWn3, null));
                } else {
                    if (map2.keySet().iterator().next() instanceof String) {
                        map = this.zzWn1;
                        objZzXJk = zzzagZzY5.zzXJB().zzXJk().getId();
                    } else {
                        map = this.zzWn1;
                        objZzXJk = zzzagZzY5.zzXJB().zzXJk();
                    }
                    arrayList.add(new zzZ63(zzzagZzY5, zzzdaZzXJW, null, (byte[]) map.get(objZzXJk)));
                }
            }
            this.zzWn2 = new zzZ62(arrayList);
        }
        return this.zzWn2;
    }

    public zzZ6H(final zzZ6L zzz6l, zzZAP zzzap) throws zzZ6M {
        if (zzz6l instanceof zzZ6D) {
            this.zzWn3 = (zzZ6D) zzz6l;
        } else {
            this.zzWn3 = new zzZ6D() { // from class: com.aspose.words.internal.zzZ6H.1
                @Override // com.aspose.words.internal.zzZ6L
                public final Object getContent() {
                    return zzz6l.getContent();
                }

                @Override // com.aspose.words.internal.zzZ6L
                public final void write(OutputStream outputStream) throws zzZ6M, IOException {
                    zzz6l.write(outputStream);
                }

                @Override // com.aspose.words.internal.zzZ6D
                public final zzZDA zzXJW() {
                    return zzZ6H.this.zzWn4.zzXJN().zzXJW();
                }
            };
        }
        this.zzWFl = zzzap;
        this.zzWn4 = zzXHm();
    }

    public zzZ6H(zzZAP zzzap) throws zzZ6M {
        this.zzWFl = zzzap;
        zzZAJ zzzajZzXHm = zzXHm();
        this.zzWn4 = zzzajZzXHm;
        zzZDK zzzdkZzXJV = zzzajZzXHm.zzXJN().zzXJV();
        if (zzzdkZzXJV != null) {
            if (zzzdkZzXJV instanceof zzZD9) {
                this.zzWn3 = new zzZ6K(this.zzWn4.zzXJN().zzXJW(), ((zzZD9) zzzdkZzXJV).zzXL5());
                return;
            } else {
                this.zzWn3 = new zzZ67(this.zzWn4.zzXJN().zzXJW(), zzzdkZzXJV);
                return;
            }
        }
        this.zzWn3 = null;
    }
}
