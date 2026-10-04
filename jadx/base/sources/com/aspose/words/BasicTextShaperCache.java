package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class BasicTextShaperCache implements ITextShaperFactory, com.aspose.words.internal.zzZOY {
    private ITextShaperFactory zzZDn;
    private HashMap<String, ITextShaper> zzZDo = new HashMap<>();
    private Object zzZDm = new Object();

    public BasicTextShaperCache(ITextShaperFactory iTextShaperFactory) {
        if (iTextShaperFactory == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: factory");
        }
        this.zzZDn = iTextShaperFactory;
    }

    private HashMap<String, ITextShaper> zz9X() {
        if (this.zzZDn != null) {
            return this.zzZDo;
        }
        throw new IllegalStateException("Disposed object: BasicTextShaperCache");
    }

    private void zzGY() throws Exception {
        if (this.zzZDn == null) {
            return;
        }
        synchronized (this.zzZDm) {
            try {
                for (ITextShaper iTextShaper : this.zzZDo.values()) {
                    if (iTextShaper != null) {
                        iTextShaper.dispose();
                    }
                }
                this.zzZDo.clear();
                this.zzZDn = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.aspose.words.internal.zzZOY
    public final void dispose() throws Exception {
        zzGY();
    }

    @Override // com.aspose.words.ITextShaperFactory
    @ReservedForInternalUse
    @Deprecated
    public final ITextShaper getTextShaper(String str, int i) {
        ITextShaper textShaper;
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: fontPath");
        }
        String str2 = com.aspose.words.internal.zzZKN.format("{0}:{1}", com.aspose.words.internal.zzZKN.zzU2(str), Integer.valueOf(i));
        Ref ref = new Ref(null);
        com.aspose.words.internal.zzZQF.zzZ(zz9X(), str2, ref);
        ITextShaper iTextShaper = (ITextShaper) ref.get();
        synchronized (this.zzZDm) {
            try {
                ref.set(iTextShaper);
                boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(zz9X(), str2, ref);
                textShaper = (ITextShaper) ref.get();
                if (!zZzZ) {
                    textShaper = this.zzZDn.getTextShaper(str, i);
                    com.aspose.words.internal.zzZQF.zzY(zz9X(), str2, textShaper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return textShaper;
    }

    @Override // com.aspose.words.ITextShaperFactory
    @ReservedForInternalUse
    @Deprecated
    public final ITextShaper getTextShaper(String str, byte[] bArr, int i) {
        ITextShaper textShaper;
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: fontId");
        }
        if (bArr != null) {
            String str2 = com.aspose.words.internal.zzZKN.format("{0}:{1}", str, Integer.valueOf(i));
            Ref ref = new Ref(null);
            com.aspose.words.internal.zzZQF.zzZ(zz9X(), str2, ref);
            ITextShaper iTextShaper = (ITextShaper) ref.get();
            synchronized (this.zzZDm) {
                try {
                    ref.set(iTextShaper);
                    boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(zz9X(), str2, ref);
                    textShaper = (ITextShaper) ref.get();
                    if (!zZzZ) {
                        textShaper = this.zzZDn.getTextShaper(str, bArr, i);
                        com.aspose.words.internal.zzZQF.zzY(zz9X(), str2, textShaper);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return textShaper;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: fontBlob");
    }
}
