package com.aspose.words.internal;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.words.ControlChar;
import com.microsoft.identity.common.java.providers.oauth2.TokenRequest;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes5.dex */
final class zz03 {
    private zz06 zzdK;

    public zz03(zz06 zz06Var) {
        this.zzdK = zz06Var;
    }

    public final String zzZ(zzW zzw) throws Exception {
        int iZzs4 = this.zzdK.zzs4();
        String str = zzZKN.format("ImageData{0}", Integer.valueOf(iZzs4));
        String str2 = zzZKN.format("ImageForm{0}", Integer.valueOf(iZzs4));
        zzZOR zzzor = new zzZOR();
        try {
            try {
                zzw.zzY(zzzor);
            } catch (Exception unused) {
                zzw = zzW.zzZ(this.zzdK, zzEF.zzDL(), (zzEP) null);
                zzw.zzY(zzzor);
            }
            zz45 zz45VarZzW = zzw.zzW();
            zzzor = new zzZOR();
            try {
                zz45VarZzW.zzZ(zzzor, zzzor, null);
                byte[] bArrZzZX = zzZYQ.zzZX(zzzor);
                zzzor.close();
                this.zzdK.zzs2().zzZ(bArrZzZX, zz45VarZzW, str);
                zzzor.close();
                this.zzdK.zzs2().zzm("/{0}", str2);
                this.zzdK.zzs2().zzFd();
                this.zzdK.zzs2().zzM("/FormType", 1);
                this.zzdK.zzs2().zzZ("/BBox", new zzZQ4(0.0f, 0.0f, zzw.zzQ().getWidth(), zzw.zzQ().getHeight()));
                this.zzdK.zzs2().zzZ("/Matrix", new zzP9());
                this.zzdK.zzs2().zzl("/PaintProc", zzZ(zzw, str));
                this.zzdK.zzs2().zzFc();
                this.zzdK.zzs2().zzXB("def");
                return str2;
            } finally {
                zzzor.close();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static String zzZ(zzW zzw, String str) {
        StringBuilder sb = new StringBuilder();
        zzZNH.zzV(sb, "{");
        zzZNH.zzV(sb, TokenRequest.TokenType.POP);
        zzZNH.zzZ(sb, "{0} 0 setfileposition", str);
        sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        zzZNH.zzV(sb, "save");
        zzZNH.zzZ(sb, "{0} {1} scale", zzJB.zzr(zzw.zzQ().getWidth()), zzJB.zzr(zzw.zzQ().getHeight()));
        sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        if (zzw.zzP() == zz57.zzvJ()) {
            zzZNH.zzZ(sb, "[ /Indexed /DeviceRGB {0} ", Integer.valueOf(zzw.zzS().length - 1));
            sb.append('<');
            for (int i = 0; i < zzw.zzS().length; i++) {
                zzZNH.zzZ(sb, "{0:X2}", Integer.valueOf(zzw.zzS()[i].zzPC()));
                zzZNH.zzZ(sb, "{0:X2}", Integer.valueOf(zzw.zzS()[i].zzPB()));
                zzZNH.zzZ(sb, "{0:X2}", Integer.valueOf(zzw.zzS()[i].zzPA()));
                sb.append(ControlChar.SPACE_CHAR);
            }
            sb.append('>');
            zzZNH.zzV(sb, "] setcolorspace");
        } else {
            zzZNH.zzZ(sb, "{0} ", zzw.zzP().zzwE());
            zzZNH.zzV(sb, "setcolorspace");
        }
        zzZNH.zzU(sb, "<<");
        zzZNH.zzV(sb, "/ImageType 1");
        zzZNH.zzZ(sb, "/Width {0}", Integer.valueOf(zzw.zzQ().getWidth()));
        zzZNH.zzZ(sb, "/Height {0}", Integer.valueOf(zzw.zzQ().getHeight()));
        zzZNH.zzZ(sb, "/ImageMatrix [ {0} 0 0 {1} 0 0 ]", Integer.valueOf(zzw.zzQ().getWidth()), Integer.valueOf(zzw.zzQ().getHeight()));
        zzZNH.zzZ(sb, "/DataSource {0}", str);
        zzZNH.zzZ(sb, "/BitsPerComponent {0}", Integer.valueOf(zzw.zzO()));
        if (zzw.zzP() == zz57.zzvJ()) {
            sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
            zzZNH.zzZ(sb, "/Decode [0 {0}]", Double.valueOf(Math.pow(2.0d, zzw.zzO()) - 1.0d));
        } else {
            zzZNH.zzV(sb, "/Decode [0 1 0 1 0 1]");
        }
        zzZNH.zzV(sb, ">>");
        zzZNH.zzV(sb, "image");
        zzZNH.zzV(sb, RequestParameters.X_OSS_RESTORE);
        zzZNH.zzV(sb, "} bind");
        return sb.toString();
    }
}
