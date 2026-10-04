package com.alipay.share.sdk.openapi;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.alipay.share.sdk.Constant;
import com.alipay.share.sdk.openapi.SendMessageToZFB;
import com.alipay.share.sdk.openapi.algorithm.MD5;
import com.alipay.share.sdk.openapi.channel.APMessageAct;
import com.alipay.share.sdk.plugin.APVersionCheck;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.IEnumerator;
import java.util.Iterator;

/* JADX INFO: loaded from: base.apk:libs/libapshare.jar:com/alipay/share/sdk/openapi/APApiImlV1.class */
public class APApiImlV1 implements IAPApi {
    private static final String TAG = "APSDK.ZFBApiImlV1";
    private Context context;
    private String appId;
    private boolean needSignatureCheck;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0002: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('appId' java.lang.String)]), block:B:2:0x0000 */
    public APApiImlV1(Object obj) {
        String appId;
        this(obj, appId, false);
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x000f: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('needSignatureCheck' boolean)]), block:B:2:0x0000 */
    public APApiImlV1(Object[] objArr, int i) {
        boolean needSignatureCheck;
        this.context = objArr;
        this.appId = i;
        this.needSignatureCheck = needSignatureCheck;
    }

    public Object get_Item(int i) {
        try {
            PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(Constant.ZFB_PACKAGE_NAME, 64);
            if (packageInfo != null) {
                if (checkSumConsistent(packageInfo.signatures)) {
                    return 1;
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00b9: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
      (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('apiEventHandler' com.alipay.share.sdk.openapi.IAPAPIEventHandler)])
     (LINE:71), block:B:15:0x00ac */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00d0: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
      (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('apiEventHandler' com.alipay.share.sdk.openapi.IAPAPIEventHandler)])
     (LINE:75), block:B:17:0x00c3 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00e7: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
      (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('apiEventHandler' com.alipay.share.sdk.openapi.IAPAPIEventHandler)])
     (LINE:79), block:B:19:0x00da */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00fe: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
      (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('apiEventHandler' com.alipay.share.sdk.openapi.IAPAPIEventHandler)])
     (LINE:83), block:B:21:0x00f1 */
    public final int indexOfItem(Object obj) {
        IAPAPIEventHandler apiEventHandler;
        IAPAPIEventHandler apiEventHandler2;
        IAPAPIEventHandler apiEventHandler3;
        IAPAPIEventHandler apiEventHandler4;
        String messageContent = obj.getStringExtra(Constant.EXTRA_MESSAGE_CONTENT);
        int messageSdkVersion = obj.getIntExtra(Constant.EXTRA_MESSAGE_SDK_VERSION, 0);
        String packageName = obj.getStringExtra(Constant.EXTRA_MESSAGE_APP_PACKAGE_NAME);
        if (packageName != null && packageName.length() != 0) {
            byte[] checkSums = obj.getByteArrayExtra(Constant.EXTRA_MESSAGE_CHECK_SUM);
            StringBuffer stringBuffer = new StringBuffer();
            if (messageContent != null) {
                stringBuffer.append(messageContent);
            }
            stringBuffer.append(messageSdkVersion);
            stringBuffer.append(packageName);
            stringBuffer.append("alipay");
            byte[] reCheckSum = MD5.getMessageDigest(stringBuffer.toString().substring(1, 9).getBytes()).getBytes();
            if (!checkSumConsistent(checkSums, reCheckSum)) {
                Log.e(TAG, "checksum fail");
                return 0;
            }
            switch (obj.getIntExtra(Constant.EXTRA_COMMAND_TYPE, 0)) {
                case 1:
                    SendMessageToZFB.Resp resp = new SendMessageToZFB.Resp(obj.getExtras());
                    apiEventHandler4.onResp(resp);
                    return 1;
                case 2:
                    SendMessageToZFB.Resp resp1 = new SendMessageToZFB.Resp(obj.getExtras());
                    apiEventHandler3.onResp(resp1);
                    return 1;
                case 3:
                    SendMessageToZFB.Req req = new SendMessageToZFB.Req(obj.getExtras());
                    apiEventHandler2.onReq(req);
                    return 1;
                case 4:
                    SendMessageToZFB.Req req1 = new SendMessageToZFB.Req(obj.getExtras());
                    apiEventHandler.onReq(req1);
                    return 1;
                default:
                    return 0;
            }
        }
        Log.e(TAG, "invalid argument");
        return 0;
    }

    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        	at jadx.core.dex.visitors.ssa.RenameState.startVar(RenameState.java:58)
        	at jadx.core.dex.visitors.ssa.RenameState.init(RenameState.java:28)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:123)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:57)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    public void insertItem(int r4, java.lang.Object r5) {
        /*
            r3 = this;
            r0 = r3
            int r0 = r0.getZFBVersionCode()
            r1 = 77
            if (r0 < r1) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.share.sdk.openapi.APApiImlV1.insertItem(int, java.lang.Object):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public boolean isReadOnly() {
        return new APVersionCheck(this.context).getZFBAppVersionCode();
    }

    public IGenericEnumerator iterator() {
        if (!isZFBAppInstalled()) {
            Log.e(TAG, "open Alipay app failed, not installed or signature check failed");
            return null;
        }
        try {
            this.context.startActivity(this.context.getPackageManager().getLaunchIntentForPackage(Constant.ZFB_PACKAGE_NAME));
            return 1;
        } catch (Exception exception) {
            Log.e(TAG, "start Alipay Main Activity fail, exception = " + exception.getMessage());
            return null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0013: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('req' com.alipay.share.sdk.openapi.BaseReq)]) (LINE:131), block:B:6:0x0013 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean, com.aspose.slides.Collections.IEnumerator] */
    /* JADX INFO: renamed from: iterator, reason: collision with other method in class */
    public IEnumerator m80681iterator() {
        BaseReq req;
        if (!checkSumConsistent(Constant.ZFB_PACKAGE_NAME)) {
            Log.e(TAG, "sendReq failed for alipay app signature check failed");
            return null;
        }
        if (!req.checkArgs()) {
            Log.e(TAG, "sendReq checkArgs fail");
            return null;
        }
        Bundle bundle = new Bundle();
        req.toBundle(bundle);
        return APMessageAct.sendToZFB(this.context, Constant.SEND_REQUEST_CONTENT_APPID + this.appId, bundle);
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0018: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('packageName' java.lang.String)]), block:B:6:0x0011 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean, java.util.Iterator] */
    /* JADX INFO: renamed from: iterator, reason: collision with other method in class */
    private Iterator m80682iterator() {
        String packageName;
        if (!this.needSignatureCheck) {
            Log.d(TAG, "ignore alipay app signature validation");
            return 1;
        }
        try {
            PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(packageName, 64);
            return checkSumConsistent(packageInfo.signatures);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void removeAt(int i) {
        if (!this.needSignatureCheck) {
            Log.d(TAG, "ignore alipay app signature validation");
            return 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0010: RETURN (1 void) (LINE:160) in method: com.alipay.share.sdk.openapi.APApiImlV1.removeAt(int):void, file: base.apk:libs/libapshare.jar:com/alipay/share/sdk/openapi/APApiImlV1.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Unknown type in literalToString: void
                	at jadx.core.codegen.TypeGen.literalToString(TypeGen.java:97)
                	at jadx.core.codegen.TypeGen.literalToString(TypeGen.java:37)
                	at jadx.core.codegen.InsnGen.lit(InsnGen.java:183)
                	at jadx.core.codegen.InsnGen.addLiteralArg(InsnGen.java:130)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	... 23 more
                */
            /*
                this = this;
                r0 = r4
                boolean r0 = r0.needSignatureCheck
                if (r0 != 0) goto L11
                java.lang.String r0 = "APSDK.ZFBApiImlV1"
                java.lang.String r1 = "ignore alipay app signature validation"
                int r0 = android.util.Log.d(r0, r1)
                r0 = 1
                return r0
            L11:
                r0 = r5
                r6 = r0
                r0 = r6
                int r0 = r0.length
                r7 = r0
                r0 = 0
                r8 = r0
            L19:
                r0 = r8
                r1 = r7
                if (r0 >= r1) goto L60
                r0 = r6
                r1 = r8
                r0 = r0[r1]
                r9 = r0
                r0 = r9
                java.lang.String r0 = r0.toCharsString()
                r10 = r0
                java.lang.String r0 = "APSDK.ZFBApiImlV1"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r2 = r1
                r2.<init>()
                java.lang.String r2 = "check signature:"
                java.lang.StringBuilder r1 = r1.append(r2)
                r2 = r10
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                int r0 = android.util.Log.d(r0, r1)
                r0 = r10
                java.lang.String r1 = "30820244308201ad02044b28a3c9300d06092a864886f70d01010405003068310b300906035504061302636e3110300e060355040813076265696a696e673110300e060355040713076265696a696e67310f300d060355040a1306616c69706179310f300d060355040b1306616c69706179311330110603550403130a73686971756e2e7368693020170d3039313231363039303932395a180f32303531303131303039303932395a3068310b300906035504061302636e3110300e060355040813076265696a696e673110300e060355040713076265696a696e67310f300d060355040a1306616c69706179310f300d060355040b1306616c69706179311330110603550403130a73686971756e2e73686930819f300d06092a864886f70d010101050003818d0030818902818100b6cbad6cbd5ed0d209afc69ad3b7a617efaae9b3c47eabe0be42d924936fa78c8001b1fd74b079e5ff9690061dacfa4768e981a526b9ca77156ca36251cf2f906d105481374998a7e6e6e18f75ca98b8ed2eaf86ff402c874cca0a263053f22237858206867d210020daa38c48b20cc9dfd82b44a51aeb5db459b22794e2d6490203010001300d06092a864886f70d010104050003818100b6b5e3854b2d5daaa02d127195d13a1927991176047982feaa3d1625740788296443e9000fe14dfe6701d7e86be06b9282e68d4eff32b19d48555b8a0838a6e146238f048aca986715d7eab0fb445796bbd19360a7721b8d99ba04581af957a290c47302055f813862f3c40b840e95898e72a1de03b6257a1acad4b482cd815c"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L5a
                java.lang.String r0 = "APSDK.ZFBApiImlV1"
                java.lang.String r1 = "checkSumConsistent pass"
                int r0 = android.util.Log.d(r0, r1)
                r0 = 1
                return r0
            L5a:
                int r8 = r8 + 1
                goto L19
            L60:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alipay.share.sdk.openapi.APApiImlV1.removeAt(int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0009: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('bytes1' byte[])]), block:B:6:0x0009 */
        private static boolean removeItem(Object obj) {
            byte[] bytes1;
            if (obj != 0 && obj.length != 0 && bytes1 != null && bytes1.length != 0) {
                if (obj.length != bytes1.length) {
                    Log.e(TAG, "checkSumConsistent fail, length is different");
                    return false;
                }
                for (int i = 0; i < obj.length; i++) {
                    if (obj[i] != bytes1[i]) {
                        return false;
                    }
                }
                return true;
            }
            Log.e(TAG, "checkSumConsistent fail, invalid arguments");
            return false;
        }
    }
