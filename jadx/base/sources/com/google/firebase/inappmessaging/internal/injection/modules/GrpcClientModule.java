package com.google.firebase.inappmessaging.internal.injection.modules;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.common.base.Preconditions;
import com.google.common.p563io.BaseEncoding;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inappmessaging.dagger.Module;
import com.google.firebase.inappmessaging.dagger.Provides;
import com.google.internal.firebase.inappmessaging.p566v1.sdkserving.InAppMessagingSdkServingGrpc;
import io.grpc.stub.C23929OooO0oO;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import oO0OOo0o.AbstractC33060OooO0Oo;
import oO0OOo0o.C33063OooO0oo;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.InterfaceC33062OooO0oO;

/* JADX INFO: loaded from: classes8.dex */
@Module
public class GrpcClientModule {
    private final FirebaseApp firebaseApp;

    public GrpcClientModule(FirebaseApp firebaseApp) {
        this.firebaseApp = firebaseApp;
    }

    public static String getSignature(PackageManager packageManager, String str) {
        Signature[] signatureArr;
        Signature signature;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0 && (signature = signatureArr[0]) != null) {
                return signatureDigest(signature);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    private static String signatureDigest(Signature signature) {
        try {
            return BaseEncoding.base16().upperCase().encode(MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @Provides
    public C33094OoooO providesApiKeyHeaders() {
        C33094OoooO.OooO00o oooO00o = C33094OoooO.f119652OooO0Oo;
        BitSet bitSet = C33094OoooO.AbstractC33095OooO0Oo.f119657OooO0Oo;
        C33094OoooO.OooO0O0 oooO0O0 = new C33094OoooO.OooO0O0("X-Goog-Api-Key", oooO00o);
        C33094OoooO.OooO0O0 oooO0O02 = new C33094OoooO.OooO0O0("X-Android-Package", oooO00o);
        C33094OoooO.OooO0O0 oooO0O03 = new C33094OoooO.OooO0O0("X-Android-Cert", oooO00o);
        C33094OoooO c33094OoooO = new C33094OoooO();
        String packageName = this.firebaseApp.getApplicationContext().getPackageName();
        c33094OoooO.OooO0o(oooO0O0, this.firebaseApp.getOptions().getApiKey());
        c33094OoooO.OooO0o(oooO0O02, packageName);
        String signature = getSignature(this.firebaseApp.getApplicationContext().getPackageManager(), packageName);
        if (signature != null) {
            c33094OoooO.OooO0o(oooO0O03, signature);
        }
        return c33094OoooO;
    }

    @Provides
    public InAppMessagingSdkServingGrpc.InAppMessagingSdkServingBlockingStub providesInAppMessagingSdkServingStub(AbstractC33060OooO0Oo abstractC33060OooO0Oo, C33094OoooO c33094OoooO) {
        InterfaceC33062OooO0oO[] interfaceC33062OooO0oOArr = {new C23929OooO0oO(c33094OoooO)};
        int i = C33063OooO0oo.f119548OooO00o;
        List listAsList = Arrays.asList(interfaceC33062OooO0oOArr);
        Preconditions.checkNotNull(abstractC33060OooO0Oo, "channel");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            abstractC33060OooO0Oo = new C33063OooO0oo.OooO0O0(abstractC33060OooO0Oo, (InterfaceC33062OooO0oO) it.next());
        }
        return InAppMessagingSdkServingGrpc.newBlockingStub(abstractC33060OooO0Oo);
    }
}
