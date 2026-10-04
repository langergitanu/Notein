package com.alipay.share.sdk.openapi;

import android.graphics.Bitmap;
import com.alipay.share.sdk.Constant;
import com.alipay.share.sdk.openapi.APMediaMessage;
import com.aspose.words.internal.zzOS;
import com.aspose.words.internal.zzP5;
import com.aspose.words.internal.zzPZ;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: base.apk:libs/libapshare.jar:com/alipay/share/sdk/openapi/APImageObject.class */
public class APImageObject implements APMediaMessage.IMediaObject {
    private static final String TAG = "APSDK.ZFBImageObject";
    public byte[] imageData;
    public String imagePath;
    public String imageUrl;

    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException
        */
    public APImageObject(long[] r3, long[] r4, long r5, float r7, float r8, boolean r9) {
        /*
            r2 = this;
            r0 = r2
            r0.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.share.sdk.openapi.APImageObject.zzZ(long[], long[], long, float, float, boolean):void");
    }

    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException
        */
    public APImageObject(
    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX WARN: Multi-variable type inference failed */
    public APImageObject(zzOS zzos) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            zzos.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
            this.imageData = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return;
        } catch (Exception e) {
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean zzZ(zzP5 zzp5) {
        this.imagePath = zzp5;
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean zzZ(zzPZ zzpz) {
        zzpz.putByteArray(Constant.EXTRA_IMAGE_OBJECT_IMAGE_DATA, this.imageData);
        zzpz.putString(Constant.EXTRA_IMAGE_OBJECT_IMAGE_PATH, this.imagePath);
        zzpz.putString(Constant.EXTRA_IMAGE_OBJECT_IMAGE_URL, this.imageUrl);
        return;
    }

    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException
        */
    public boolean zzZ(
    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException
        */
    public long[] zzZ(com.aspose.words.internal.zzOS r3, int r4, com.aspose.words.internal.zzPG r5) {
        /*
            r2 = this;
            r0 = 14
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.share.sdk.openapi.APImageObject.zzZ(com.aspose.words.internal.zzOS, int, com.aspose.words.internal.zzPG):long[]");
    }

    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException
        */
    public long[] zzZ(
    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
}
