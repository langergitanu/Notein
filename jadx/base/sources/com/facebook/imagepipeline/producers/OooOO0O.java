package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import o00oo.C25638OooO0oO;
import o00ooO0o.C25763OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOO0O extends AbstractC22281Oooo00o {
    @Override // com.facebook.imagepipeline.producers.AbstractC22281Oooo00o
    public final C25638OooO0oO OooO0OO(C25763OooO00o c25763OooO00o) throws IOException {
        boolean zEquals;
        byte[] bytes;
        String string = c25763OooO00o.f87911OooO0O0.toString();
        if (!string.substring(0, 5).equals("data:")) {
            throw new IllegalArgumentException();
        }
        int iIndexOf = string.indexOf(44);
        String strSubstring = string.substring(iIndexOf + 1, string.length());
        String strSubstring2 = string.substring(0, iIndexOf);
        if (strSubstring2.contains(";")) {
            zEquals = strSubstring2.split(";")[r5.length - 1].equals("base64");
        } else {
            zEquals = false;
        }
        if (zEquals) {
            bytes = Base64.decode(strSubstring, 0);
        } else {
            String strDecode = Uri.decode(strSubstring);
            strDecode.getClass();
            bytes = strDecode.getBytes();
        }
        return OooO0O0(new ByteArrayInputStream(bytes), bytes.length);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC22281Oooo00o
    public final String OooO0Oo() {
        return "DataFetchProducer";
    }
}
