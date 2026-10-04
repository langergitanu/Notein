package o0OOooOO;

import com.orion.notein.domain.models.paper.ColorAlreadyExistsException;
import com.orion.notein.domain.models.paper.ColorLimitExceededException;
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

/* JADX INFO: renamed from: o0OOooOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.paper.AddCustomPaperColorUseCase$invoke$2", m80623f = "AddCustomPaperColorUseCase.kt", m80624l = {24, 41}, m80625m = "invokeSuspend")
public final class C27965OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends C32460OooOooO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f99149OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99150OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27966OooO0OO f99151OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f99152OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ int f99153OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27965OooO0O0(C27966OooO0OO c27966OooO0OO, int i, Continuation<? super C27965OooO0O0> continuation) {
        super(2, continuation);
        this.f99151OooOoO = c27966OooO0OO;
        this.f99153OooOoOO = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27965OooO0O0 c27965OooO0O0 = new C27965OooO0O0(this.f99151OooOoO, this.f99153OooOoOO, continuation);
        c27965OooO0O0.f99152OooOoO0 = obj;
        return c27965OooO0O0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends C32460OooOooO>> continuation) {
        return ((C27965OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO00o;
        Throwable thOooO00o;
        C27966OooO0OO c27966OooO0OO;
        int i;
        int i2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = this.f99149OooOo;
        int i4 = this.f99153OooOoOO;
        try {
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27966OooO0OO c27966OooO0OO2 = this.f99151OooOoO;
            C27086OooO0o0 c27086OooO0o0OooO0oo = c27966OooO0OO2.f99154OooO00o.OooO0oo();
            this.f99152OooOoO0 = c27966OooO0OO2;
            this.f99150OooOo0o = i4;
            this.f99149OooOo = 1;
            Object objOooOOo = C25252OooO0Oo.OooOOo(c27086OooO0o0OooO0oo, this);
            if (objOooOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27966OooO0OO = c27966OooO0OO2;
            obj = objOooOOo;
            i = i4;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.f99150OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.f123390OooO00o.OooO00o("Successfully added custom paper color: #" + Integer.toHexString(i2), new Object[0]);
                objOooO00o = C32460OooOooO.f116667OooO00o;
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("AddCustomPaperColorUseCase");
                    c20358OooO00o.OooO0Oo(thOooO00o, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Failed to add custom paper color: #", Integer.toHexString(i4)), new Object[0]);
                }
                return new C32445OooOOOO(objOooO00o);
            }
            i = this.f99150OooOo0o;
            c27966OooO0OO = (C27966OooO0OO) this.f99152OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
        }
        List list = (List) obj;
        if (OooOo.OooooOO(c27966OooO0OO.f99154OooO00o.OooO(), list).contains(new Integer(i))) {
            throw new ColorAlreadyExistsException(i);
        }
        if (list.size() >= 10) {
            throw new ColorLimitExceededException(10);
        }
        ArrayList arrayListOooooOo = OooOo.OooooOo(list, new Integer(i));
        C27095OooOo0O c27095OooOo0O = c27966OooO0OO.f99154OooO00o;
        this.f99152OooOoO0 = null;
        this.f99150OooOo0o = i;
        this.f99149OooOo = 2;
        if (c27095OooOo0O.OooOOOo(arrayListOooooOo, this) != enumC32485OooO00o) {
            i2 = i;
            C34406OooO00o.f123390OooO00o.OooO00o("Successfully added custom paper color: #" + Integer.toHexString(i2), new Object[0]);
            objOooO00o = C32460OooOooO.f116667OooO00o;
            thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
            if (thOooO00o != null) {
            }
            return new C32445OooOOOO(objOooO00o);
        }
        return enumC32485OooO00o;
    }
}
