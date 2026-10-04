package o0OOooo0;

import com.orion.notein.domain.models.page.Quote;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000O00.C24378OooOoO0;
import o0OO00o0.C26623o00Oo0Oo;
import o0OO00o0.C26629o00OoO0;
import o0OOoO.C27710OooO0oo;
import o0OOoo0o.C27869OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOooo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.quote.QuoteUseCase$clearQuotesByPage$2", m80623f = "QuoteUseCase.kt", m80624l = {171, 174, 175, 177}, m80625m = "invokeSuspend")
public final class C27981OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f99208OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ArrayList f99209OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f99210OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27994OooOOOO f99211OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f99212OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27981OooO00o(C27994OooOOOO c27994OooOOOO, String str, String str2, Continuation<? super C27981OooO00o> continuation) {
        super(2, continuation);
        this.f99211OooOoO0 = c27994OooOOOO;
        this.f99210OooOoO = str;
        this.f99212OooOoOO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27981OooO00o(this.f99211OooOoO0, this.f99210OooOoO, this.f99212OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27981OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        if (r12 != r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        C27869OooOOO c27869OooOOO;
        Object objOooO00o;
        EnumC32485OooO00o enumC32485OooO00o;
        EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99208OooOo;
        C27994OooOOOO c27994OooOOOO = this.f99211OooOoO0;
        String str = this.f99210OooOoO;
        String str2 = this.f99212OooOoOO;
        C24378OooOoO0 c24378OooOoO0 = c27994OooOOOO.f99260OooO00o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f99208OooOo = 1;
            obj = c24378OooOoO0.OooO0Oo(str, str2, this);
            if (obj != enumC32485OooO00o2) {
            }
            return enumC32485OooO00o2;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i == 2) {
                arrayList = this.f99209OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c27869OooOOO = c27994OooOOOO.f99264OooO0o;
                this.f99209OooOo0o = null;
                this.f99208OooOo = 3;
                if (c27869OooOOO.OooO00o(str2, arrayList, this) != enumC32485OooO00o2) {
                    this.f99208OooOo = 4;
                    C26629o00OoO0 c26629o00OoO0 = (C26629o00OoO0) c24378OooOoO0.f82246OooO00o;
                    c26629o00OoO0.getClass();
                    objOooO00o = c26629o00OoO0.OooO00o(str2, new C26623o00Oo0Oo(str, null));
                    enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    if (objOooO00o != enumC32485OooO00o) {
                    }
                    if (objOooO00o != enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o2;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            this.f99208OooOo = 4;
            C26629o00OoO0 c26629o00OoO02 = (C26629o00OoO0) c24378OooOoO0.f82246OooO00o;
            c26629o00OoO02.getClass();
            objOooO00o = c26629o00OoO02.OooO00o(str2, new C26623o00Oo0Oo(str, null));
            enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
        }
        List list = (List) obj;
        arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Quote) it.next()).getLinkId());
        }
        C27710OooO0oo c27710OooO0oo = c27994OooOOOO.f99265OooO0o0;
        this.f99209OooOo0o = arrayList;
        this.f99208OooOo = 2;
        if (c27710OooO0oo.OooO0O0(str2, arrayList, this) != enumC32485OooO00o2) {
            c27869OooOOO = c27994OooOOOO.f99264OooO0o;
            this.f99209OooOo0o = null;
            this.f99208OooOo = 3;
            if (c27869OooOOO.OooO00o(str2, arrayList, this) != enumC32485OooO00o2) {
            }
        }
        return enumC32485OooO00o2;
    }
}
