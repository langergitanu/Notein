package com.alipay.share.sdk.openapi;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import com.alipay.share.sdk.Constant;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.firebase.storage.StorageTask;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: base.apk:libs/libapshare.jar:com/alipay/share/sdk/openapi/APMediaMessage.class */
public class APMediaMessage {
    private static final String TAG = "APSDK.ZFBMediaMessage";
    public int sdkVer;
    public String title;
    public String description;
    public byte[] thumbData;
    public String thumbUrl;
    public String bizType;
    public IMediaObject mediaObject;

    /* JADX INFO: loaded from: base.apk:libs/libapshare.jar:com/alipay/share/sdk/openapi/APMediaMessage$IMediaObject.class */
    public interface IMediaObject {
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_TEXT = 11;
        public static final int TYPE_IMAGE = 14;
        public static final int TYPE_STOCK = 120;
        public static final int TYPE_URL = 1001;
        public static final int TYPE_TAOBAO_GOODS = 1010;
        public static final int TYPE_FUND = 122;

        void zzx(zzlu zzluVar);

        void zzy(String str, zzlu zzluVar, boolean z);

        void zzz(zzlu zzluVar, zzlu zzluVar2, long j, boolean z, Bundle bundle);

        /* JADX INFO: renamed from: <init>, reason: not valid java name */
        void m80688init(zznl zznlVar, String str, String str2, zzr zzrVar, boolean z, zzcu zzcuVar);
    }

    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException
        */
    public APMediaMessage(com.google.android.gms.tasks.OnSuccessListener r4, com.google.firebase.storage.StorageTask.ProvideError r5) {
        /*
            r3 = this;
            r0 = r3
            r1 = 0
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.share.sdk.openapi.APMediaMessage.lambda$new$0(com.google.android.gms.tasks.OnSuccessListener, com.google.firebase.storage.StorageTask$ProvideError):void");
    }

    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException
        */
    public APMediaMessage(
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

    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException
        */
    public final void lambda$new$2(com.google.android.gms.tasks.OnCompleteListener r3, com.google.firebase.storage.StorageTask.ProvideError r4) {
        /*
            r2 = this;
            r0 = r2
            com.alipay.share.sdk.openapi.APMediaMessage$IMediaObject r0 = r0.mediaObject
            if (r0 != 0) goto Lb
            r0 = 0
            goto L14
        Lb:
            r0 = r2
            com.alipay.share.sdk.openapi.APMediaMessage$IMediaObject r0 = r0.mediaObject
            int r0 = r0.type()
        L14:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.share.sdk.openapi.APMediaMessage.lambda$new$2(com.google.android.gms.tasks.OnCompleteListener, com.google.firebase.storage.StorageTask$ProvideError):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void lambda$new$3(OnCanceledListener onCanceledListener, StorageTask.ProvideError provideError) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            onCanceledListener.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
            this.thumbData = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        } catch (Exception e) {
            Log.e(TAG, "put thumb failed");
        }
    }

    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException
        */
    final void lambda$successTaskImpl$6(com.google.android.gms.tasks.SuccessContinuation r4, com.google.android.gms.tasks.TaskCompletionSource r5, com.google.android.gms.tasks.CancellationTokenSource r6, com.google.firebase.storage.StorageTask.ProvideError r7) {
        /*
            r3 = this;
            r0 = r3
            byte[] r0 = r0.thumbData
            if (r0 == 0) goto L1b
            r0 = r3
            byte[] r0 = r0.thumbData
            int r0 = r0.length
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r0 <= r1) goto L1b
            java.lang.String r0 = "APSDK.ZFBMediaMessage"
            java.lang.String r1 = "checkArgs fail, thumbData is invalid"
            int r0 = android.util.Log.e(r0, r1)
            r0 = 0
            return r0
        L1b:
            r0 = r3
            java.lang.String r0 = r0.title
            if (r0 == 0) goto L39
            r0 = r3
            java.lang.String r0 = r0.title
            int r0 = r0.length()
            r1 = 512(0x200, float:7.17E-43)
            if (r0 <= r1) goto L39
            java.lang.String r0 = "APSDK.ZFBMediaMessage"
            java.lang.String r1 = "checkArgs fail, title is invalid"
            int r0 = android.util.Log.e(r0, r1)
            r0 = 0
            return r0
        L39:
            r0 = r3
            java.lang.String r0 = r0.description
            if (r0 == 0) goto L57
            r0 = r3
            java.lang.String r0 = r0.description
            int r0 = r0.length()
            r1 = 1024(0x400, float:1.435E-42)
            if (r0 <= r1) goto L57
            java.lang.String r0 = "APSDK.ZFBMediaMessage"
            java.lang.String r1 = "checkArgs fail, description is invalid"
            int r0 = android.util.Log.e(r0, r1)
            r0 = 0
            return r0
        L57:
            r0 = r3
            com.alipay.share.sdk.openapi.APMediaMessage$IMediaObject r0 = r0.mediaObject
            if (r0 != 0) goto L68
            java.lang.String r0 = "APSDK.ZFBMediaMessage"
            java.lang.String r1 = "checkArgs fail, mediaObject is null"
            int r0 = android.util.Log.e(r0, r1)
            r0 = 0
            return r0
        L68:
            r0 = r3
            com.alipay.share.sdk.openapi.APMediaMessage$IMediaObject r0 = r0.mediaObject
            boolean r0 = r0.checkArgs()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.share.sdk.openapi.APMediaMessage.lambda$successTaskImpl$6(com.google.android.gms.tasks.SuccessContinuation, com.google.android.gms.tasks.TaskCompletionSource, com.google.android.gms.tasks.CancellationTokenSource, com.google.firebase.storage.StorageTask$ProvideError):void");
    }

    /* JADX INFO: loaded from: base.apk:libs/libapshare.jar:com/alipay/share/sdk/openapi/APMediaMessage$Builder.class */
    public static class Builder {
        /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
            java.lang.ArrayIndexOutOfBoundsException
            */
        public Builder(int r3) {
            /*
                r2 = this;
                r0 = r2
                r0.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alipay.share.sdk.openapi.APMediaMessage.Builder.zzo5(int):com.aspose.words.TextColumn");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x000c: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
          (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('apMediaMessage' com.alipay.share.sdk.openapi.APMediaMessage)])
        , block:B:2:0x0000 */
        /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Bundle, void] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        static {
            APMediaMessage apMediaMessage;
            ?? bundle = new Bundle();
            bundle.putString(Constant.EXTRA_AP_OBJECT_BIZTYPE, apMediaMessage.bizType);
            bundle.putInt(Constant.EXTRA_AP_OBJECT_SDK_VERSION, apMediaMessage.sdkVer);
            bundle.putString(Constant.EXTRA_AP_OBJECT_TITLE, apMediaMessage.title);
            bundle.putString(Constant.EXTRA_AP_OBJECT_DESCRIPTION, apMediaMessage.description);
            bundle.putByteArray(Constant.EXTRA_AP_OBJECT_THUMB_DATA, apMediaMessage.thumbData);
            bundle.putString(Constant.EXTRA_AP_OBJECT_THUMB_URL, apMediaMessage.thumbUrl);
            if (apMediaMessage.mediaObject != null) {
                bundle.putString(Constant.EXTRA_AP_OBJECT_IDENTIFIER, apMediaMessage.mediaObject.getClass().getSimpleName());
                apMediaMessage.mediaObject.serialize(bundle);
            }
        }

        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0009: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('bundle' android.os.Bundle)]), block:B:2:0x0000 */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.alipay.share.sdk.openapi.APMediaMessage, void] */
        /* JADX INFO: renamed from: <init>, reason: not valid java name */
        public static void m80687init() {
            Bundle bundle;
            ?? aPMediaMessage = new APMediaMessage();
            aPMediaMessage.bizType = bundle.getString(Constant.EXTRA_AP_OBJECT_BIZTYPE);
            aPMediaMessage.sdkVer = bundle.getInt(Constant.EXTRA_AP_OBJECT_SDK_VERSION);
            aPMediaMessage.title = bundle.getString(Constant.EXTRA_AP_OBJECT_TITLE);
            aPMediaMessage.description = bundle.getString(Constant.EXTRA_AP_OBJECT_DESCRIPTION);
            aPMediaMessage.thumbData = bundle.getByteArray(Constant.EXTRA_AP_OBJECT_THUMB_DATA);
            aPMediaMessage.thumbUrl = bundle.getString(Constant.EXTRA_AP_OBJECT_THUMB_URL);
            String className = bundle.getString(Constant.EXTRA_AP_OBJECT_IDENTIFIER);
            if (className != null && className.length() > 0) {
                try {
                    aPMediaMessage.mediaObject = (IMediaObject) Class.forName(className).newInstance();
                    aPMediaMessage.mediaObject.unserialize(bundle);
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.e(APMediaMessage.TAG, "get media object from bundle failed: unknown ident " + className);
                }
            }
        }
    }
}
