package o00oo0Oo;

import OooooO0.C21294OooOO0O;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.imagepipeline.producers.C22297OoooOoo;
import com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O;
import java.util.concurrent.ExecutorService;
import o00o0Ooo.InterfaceC25423OooO;
import o00o0o0o.InterfaceC25443OooO00o;
import o00oo0O0.C25667OooOO0o;
import o00oo0O0.C25670OooOOOO;
import o00oo0OO.AbstractC25682OooO0O0;
import o00oo0oO.InterfaceC25727OooO0OO;
import o00oo0oO.InterfaceC25728OooO0Oo;
import o00ooO0.C25750OooOoOO;
import o00ooOO0.C25776OooO0o;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final InterfaceC25699OooOOOo f87710OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ContentResolver f87711OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Resources f87712OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AssetManager f87713OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC25443OooO00o f87714OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final InterfaceC25728OooO0Oo f87715OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC25727OooO0OO f87716OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final EnumC25696OooOOO f87717OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f87718OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C25750OooOoOO f87719OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final InterfaceC25423OooO<InterfaceC25687OooO0OO> f87720OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C25670OooOOOO f87721OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C25667OooOO0o f87722OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C25670OooOOOO f87723OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final C25685OooO00o f87724OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f87725OooOOOo;

    public OooOo(Context context, InterfaceC25443OooO00o interfaceC25443OooO00o, InterfaceC25727OooO0OO interfaceC25727OooO0OO, InterfaceC25728OooO0Oo interfaceC25728OooO0Oo, EnumC25696OooOOO enumC25696OooOOO, boolean z, InterfaceC25699OooOOOo interfaceC25699OooOOOo, C25750OooOoOO c25750OooOoOO, C25670OooOOOO c25670OooOOOO, C25670OooOOOO c25670OooOOOO2, InterfaceC25423OooO interfaceC25423OooO, C25667OooOO0o c25667OooOO0o, AbstractC25682OooO0O0 abstractC25682OooO0O0, C25685OooO00o c25685OooO00o) {
        this.f87711OooO00o = context.getApplicationContext().getContentResolver();
        this.f87712OooO0O0 = context.getApplicationContext().getResources();
        this.f87713OooO0OO = context.getApplicationContext().getAssets();
        this.f87714OooO0Oo = interfaceC25443OooO00o;
        this.f87716OooO0o0 = interfaceC25727OooO0OO;
        this.f87715OooO0o = interfaceC25728OooO0Oo;
        this.f87717OooO0oO = enumC25696OooOOO;
        this.f87718OooO0oo = z;
        this.f87710OooO = interfaceC25699OooOOOo;
        this.f87719OooOO0 = c25750OooOoOO;
        this.f87723OooOOO0 = c25670OooOOOO;
        this.f87721OooOO0o = c25670OooOOOO2;
        this.f87720OooOO0O = interfaceC25423OooO;
        this.f87722OooOOO = c25667OooOO0o;
        new C21294OooOO0O();
        new C21294OooOO0O();
        this.f87725OooOOOo = 2048;
        this.f87724OooOOOO = c25685OooO00o;
    }

    public final com.facebook.imagepipeline.producers.Oooo0 OooO00o() {
        ExecutorService executor = this.f87710OooO.OooO0OO();
        kotlin.jvm.internal.OooOOO0.OooO0oO(executor, "executor");
        C25750OooOoOO pooledByteBufferFactory = this.f87719OooOO0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(pooledByteBufferFactory, "pooledByteBufferFactory");
        return new com.facebook.imagepipeline.producers.Oooo0(executor, pooledByteBufferFactory);
    }

    public final C22297OoooOoo OooO0O0(InterfaceC22291OoooO0O interfaceC22291OoooO0O, boolean z, C25776OooO0o c25776OooO0o) {
        return new C22297OoooOoo(this.f87710OooO.OooO0O0(), this.f87719OooOO0, interfaceC22291OoooO0O, z, c25776OooO0o);
    }
}
