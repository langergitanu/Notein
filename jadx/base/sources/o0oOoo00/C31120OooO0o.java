package o0oOoo00;

import android.net.Uri;
import com.orion.notein.domain.models.backup.BackupException;
import com.orion.notein.domain.models.backup.BackupFile;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27351Oooo0O0;
import o0oOoo00.C31114OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0oOoo00.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.BackupViewModel$backup$1", m80623f = "BackupViewModel.kt", m80624l = {166, 169}, m80625m = "invokeSuspend")
public final class C31120OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C31114OooO f111062OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f111063OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Uri f111064OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31120OooO0o(C31114OooO c31114OooO, Uri uri, Continuation<? super C31120OooO0o> continuation) {
        super(2, continuation);
        this.f111062OooOo = c31114OooO;
        this.f111064OooOoO0 = uri;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31120OooO0o(this.f111062OooOo, this.f111064OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C31120OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r10.OooOOOo(r1, r4, r2, r9) == r0) goto L18;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f111063OooOo0o;
        C31114OooO c31114OooO = this.f111062OooOo;
        C33781o00o0O c33781o00o0O = c31114OooO.f111031OooOO0O;
        try {
        } catch (Exception e) {
            if (e instanceof BackupException) {
                Integer num = new Integer(((BackupException) e).getErrorCode());
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, num);
            } else {
                Integer num2 = new Integer(-999);
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, num2);
            }
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c33781o00o0O.setValue(null);
            C33781o00o0O c33781o00o0O2 = c31114OooO.f111024OooO;
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, 1);
            Float fValueOf = Float.valueOf(0.0f);
            C33781o00o0O c33781o00o0O3 = c31114OooO.f111035OooOOOO;
            c33781o00o0O3.getClass();
            c33781o00o0O3.OooOO0(null, fValueOf);
            this.f111063OooOo0o = 1;
            if (C33644OoooO0.OooO00o(300L, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            Integer num3 = new Integer(0);
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, num3);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        C27351Oooo0O0 c27351Oooo0O0 = c31114OooO.f111025OooO0Oo;
        BackupFile.DiskVendor diskVendor = BackupFile.DiskVendor.Local;
        Uri uri = this.f111064OooOoO0;
        C31114OooO.OooO0O0 oooO0O0 = c31114OooO.f111047OooOoOO;
        this.f111063OooOo0o = 2;
    }
}
