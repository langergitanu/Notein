package o0OOooOO;

import com.orion.notein.domain.models.paper.ColorNotFoundException;
import com.orion.notein.domain.models.paper.DefaultColorCannotBeRemovedException;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOOO00.C27086OooO0o0;
import o0OOOO00.C27095OooOo0O;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0OOooOO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.paper.DeleteCustomPaperColorUseCase$invoke$2", m80623f = "DeleteCustomPaperColorUseCase.kt", m80624l = {23, 40}, m80625m = "invokeSuspend")
public final class C27969OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends C32460OooOooO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f99159OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99160OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27968OooO0o f99161OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f99162OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ int f99163OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27969OooO0o0(C27968OooO0o c27968OooO0o, int i, Continuation<? super C27969OooO0o0> continuation) {
        super(2, continuation);
        this.f99161OooOoO = c27968OooO0o;
        this.f99163OooOoOO = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27969OooO0o0 c27969OooO0o0 = new C27969OooO0o0(this.f99161OooOoO, this.f99163OooOoOO, continuation);
        c27969OooO0o0.f99162OooOoO0 = obj;
        return c27969OooO0o0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends C32460OooOooO>> continuation) {
        return ((C27969OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO00o;
        Throwable thOooO00o;
        C27968OooO0o c27968OooO0o;
        int i;
        int i2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = this.f99159OooOo;
        int i4 = this.f99163OooOoOO;
        try {
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27968OooO0o c27968OooO0o2 = this.f99161OooOoO;
            C27086OooO0o0 c27086OooO0o0OooO0oo = c27968OooO0o2.f99158OooO00o.OooO0oo();
            this.f99162OooOoO0 = c27968OooO0o2;
            this.f99160OooOo0o = i4;
            this.f99159OooOo = 1;
            Object objOooOOo = C25252OooO0Oo.OooOOo(c27086OooO0o0OooO0oo, this);
            if (objOooOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27968OooO0o = c27968OooO0o2;
            obj = objOooOOo;
            i = i4;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.f99160OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.f123390OooO00o.OooO00o("Successfully deleted custom paper color: #" + Integer.toHexString(i2), new Object[0]);
                objOooO00o = C32460OooOooO.f116667OooO00o;
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("DeleteCustomPaperColorUseCase");
                    c20358OooO00o.OooO0Oo(thOooO00o, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Failed to delete custom paper color: #", Integer.toHexString(i4)), new Object[0]);
                }
                return new C32445OooOOOO(objOooO00o);
            }
            i = this.f99160OooOo0o;
            c27968OooO0o = (C27968OooO0o) this.f99162OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
        }
        List list = (List) obj;
        if (c27968OooO0o.f99158OooO00o.OooO().contains(new Integer(i))) {
            throw new DefaultColorCannotBeRemovedException(i);
        }
        if (!list.contains(new Integer(i))) {
            throw new ColorNotFoundException(i);
        }
        ArrayList arrayListOoooOoo = OooOo.OoooOoo(list, new Integer(i));
        C27095OooOo0O c27095OooOo0O = c27968OooO0o.f99158OooO00o;
        this.f99162OooOoO0 = null;
        this.f99160OooOo0o = i;
        this.f99159OooOo = 2;
        if (c27095OooOo0O.OooOOOo(arrayListOoooOoo, this) != enumC32485OooO00o) {
            i2 = i;
            C34406OooO00o.f123390OooO00o.OooO00o("Successfully deleted custom paper color: #" + Integer.toHexString(i2), new Object[0]);
            objOooO00o = C32460OooOooO.f116667OooO00o;
            thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
            if (thOooO00o != null) {
            }
            return new C32445OooOOOO(objOooO00o);
        }
        return enumC32485OooO00o;
    }
}
