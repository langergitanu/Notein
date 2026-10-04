package o0ooOO0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OOo.C33695OooO0o0;
import oO0o0OOo.InterfaceC33701OooOO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", m80623f = "WindowRecomposer.android.kt", m80624l = {115, 121}, m80625m = "invokeSuspend")
public final class o000OOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super Float>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f112885OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC33701OooOO0o f112886OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f112887OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f112888OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Uri f112889OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C33695OooO0o0 f112890OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ o000OOoO f112891OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ Context f112892OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(ContentResolver contentResolver, Uri uri, o000OOoO o000oooo2, C33695OooO0o0 c33695OooO0o0, Context context, Continuation continuation) {
        super(2, continuation);
        this.f112887OooOoO = contentResolver;
        this.f112889OooOoOO = uri;
        this.f112891OooOoo0 = o000oooo2;
        this.f112890OooOoo = c33695OooO0o0;
        this.f112892OooOooO = context;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C33695OooO0o0 c33695OooO0o0 = this.f112890OooOoo;
        Context context = this.f112892OooOooO;
        o000OOo0 o000ooo02 = new o000OOo0(this.f112887OooOoO, this.f112889OooOoOO, this.f112891OooOoo0, c33695OooO0o0, context, continuation);
        o000ooo02.f112888OooOoO0 = obj;
        return o000ooo02;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33723OooO0oO<? super Float> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        return ((o000OOo0) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r6.emit(r7, r10) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:18:0x0044, B:22:0x0055, B:24:0x005d, B:14:0x002c, B:17:0x003d), top: B:31:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007d -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        InterfaceC33701OooOO0o oooO00o;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO2;
        InterfaceC33701OooOO0o interfaceC33701OooOO0o;
        Object objOooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f112885OooOo;
        o000OOoO o000oooo2 = this.f112891OooOoo0;
        ContentResolver contentResolver = this.f112887OooOoO;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f112888OooOoO0;
                contentResolver.registerContentObserver(this.f112889OooOoOO, false, o000oooo2);
                oooO00o = new C33695OooO0o0.OooO00o();
                this.f112888OooOoO0 = interfaceC33723OooO0oO;
                this.f112886OooOo0o = oooO00o;
                this.f112885OooOo = 1;
                objOooO00o = oooO00o.OooO00o(this);
                if (objOooO00o != enumC32485OooO00o) {
                }
            } else if (i == 1) {
                interfaceC33701OooOO0o = this.f112886OooOo0o;
                interfaceC33723OooO0oO2 = (InterfaceC33723OooO0oO) this.f112888OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33701OooOO0o = this.f112886OooOo0o;
                interfaceC33723OooO0oO2 = (InterfaceC33723OooO0oO) this.f112888OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
                oooO00o = interfaceC33701OooOO0o;
                this.f112888OooOoO0 = interfaceC33723OooO0oO;
                this.f112886OooOo0o = oooO00o;
                this.f112885OooOo = 1;
                objOooO00o = oooO00o.OooO00o(this);
                if (objOooO00o != enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                InterfaceC33701OooOO0o interfaceC33701OooOO0o2 = oooO00o;
                interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                obj = objOooO00o;
                interfaceC33701OooOO0o = interfaceC33701OooOO0o2;
                if (((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(o000oooo2);
                    return C32460OooOooO.f116667OooO00o;
                }
                interfaceC33701OooOO0o.next();
                Float f = new Float(Settings.Global.getFloat(this.f112892OooOooO.getContentResolver(), "animator_duration_scale", 1.0f));
                this.f112888OooOoO0 = interfaceC33723OooO0oO2;
                this.f112886OooOo0o = interfaceC33701OooOO0o;
                this.f112885OooOo = 2;
            }
        } catch (Throwable th) {
            contentResolver.unregisterContentObserver(o000oooo2);
            throw th;
        }
    }
}
