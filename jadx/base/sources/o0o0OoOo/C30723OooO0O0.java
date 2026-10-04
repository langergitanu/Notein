package o0o0OoOo;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import o0oo000O.C31190OooO0oo;
import o0oo000O.C31193OooOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o0OoOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.viewmodel.DebugViewModel$exportLogs$2", m80623f = "DebugViewModel.kt", m80624l = {102, 103}, m80625m = "invokeSuspend")
public final class C30723OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30722OooO00o f109888OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109889OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Uri f109890OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30723OooO0O0(C30722OooO00o c30722OooO00o, Uri uri, Continuation<? super C30723OooO0O0> continuation) {
        super(2, continuation);
        this.f109888OooOo = c30722OooO00o;
        this.f109890OooOoO0 = uri;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30723OooO0O0(this.f109888OooOo, this.f109890OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C30723OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r7 == r0) goto L21;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109889OooOo0o;
        C30722OooO00o c30722OooO00o = this.f109888OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f109889OooOo0o = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30737OooOOo(c30722OooO00o, null), this);
            if (objOooO0o != obj2) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o != obj2) {
            }
            return obj2;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            String str = Environment.DIRECTORY_DOCUMENTS;
            Context context = c30722OooO00o.f109859OooO0Oo;
            ArrayList arrayListOooOo00 = C31190OooO0oo.OooOo00(new File(context.getExternalFilesDir(str), "logs"), false);
            OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(this.f109890OooOoO0);
            if (outputStreamOpenOutputStream == null) {
                return Boolean.FALSE;
            }
            try {
                C31193OooOOo.OooO0oO(arrayListOooOo00, outputStreamOpenOutputStream);
                Boolean bool = Boolean.TRUE;
                outputStreamOpenOutputStream.close();
                return bool;
            } finally {
            }
        }
        this.f109889OooOo0o = 2;
        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30733OooOOO(c30722OooO00o, null), this);
        if (objOooO0o2 != obj2) {
            objOooO0o2 = C32460OooOooO.f116667OooO00o;
        }
    }
}
