package o0OOoo0o;

import com.aspose.slides.C22227OoooO;
import com.facebook.soloader.OooOo;
import com.orion.notein.domain.models.note.Outline;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO00o0.C26620o00Oo00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOoo0o.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.outline.OutlineUseCase$updateOutline$2", m80623f = "OutlineUseCase.kt", m80624l = {176, 179, 180}, m80625m = "invokeSuspend")
public final class C27867OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f98475OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27869OooOOO f98476OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27869OooOOO f98477OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f98478OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f98479OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f98480OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f98481OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27867OooOO0O(C27869OooOOO c27869OooOOO, String str, String str2, String str3, Continuation<? super C27867OooOO0O> continuation) {
        super(2, continuation);
        this.f98477OooOoO = c27869OooOOO;
        this.f98479OooOoOO = str;
        this.f98481OooOoo0 = str2;
        this.f98480OooOoo = str3;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27867OooOO0O(this.f98477OooOoO, this.f98479OooOoOO, this.f98481OooOoo0, this.f98480OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27867OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (r5.OooO0OO(r4, r22) != r1) goto L24;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0Oo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98478OooOoO0;
        String str = this.f98479OooOoOO;
        String str2 = this.f98481OooOoo0;
        C27869OooOOO c27869OooOOO = this.f98477OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C26620o00Oo00o c26620o00Oo00o = c27869OooOOO.f98487OooO00o;
            this.f98478OooOoO0 = 1;
            objOooO0Oo = c26620o00Oo00o.OooO0Oo(str, str2, this);
            if (objOooO0Oo != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            objOooO0Oo = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            str2 = this.f98475OooOo;
            c27869OooOOO = this.f98476OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            this.f98476OooOo0o = null;
            this.f98475OooOo = null;
            this.f98478OooOoO0 = 3;
        }
        Outline outline = (Outline) objOooO0Oo;
        if (outline == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "Outline", "updateOutline failed: ", str, " not found in ");
            sbOooO00o.append(str2);
            c20358OooO00o.OooOO0O(sbOooO00o.toString(), new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        Outline outlineCopy$default = Outline.copy$default(outline, null, this.f98480OooOoo, null, null, null, null, null, 0L, 0L, 509, null);
        C26620o00Oo00o c26620o00Oo00o2 = c27869OooOOO.f98487OooO00o;
        List listOooO0oO = OooOo.OooO0oO(outlineCopy$default);
        this.f98476OooOo0o = c27869OooOOO;
        this.f98475OooOo = str2;
        this.f98478OooOoO0 = 2;
        if (c26620o00Oo00o2.OooO0o(listOooO0oO, str2, this) != enumC32485OooO00o) {
            this.f98476OooOo0o = null;
            this.f98475OooOo = null;
            this.f98478OooOoO0 = 3;
        }
        return enumC32485OooO00o;
    }
}
