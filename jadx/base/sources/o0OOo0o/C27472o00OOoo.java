package o0OOo0o;

import com.orion.notein.domain.models.page.DualLinkRef;
import com.orion.notein.domain.models.page.Image;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO00o0.C26515OooooO0;
import o0OO00o0.C26596o00O0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o00OOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$setDualLinkRefUnFixed$2", m80623f = "NoteUseCase.kt", m80624l = {549, 551, 554}, m80625m = "invokeSuspend")
public final class C27472o00OOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f96241OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27449o00O0OoO f96242OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96243OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f96244OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f96245OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f96246OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27472o00OOoo(String str, String str2, Continuation continuation, C27449o00O0OoO c27449o00O0OoO) {
        super(2, continuation);
        this.f96243OooOoO = c27449o00O0OoO;
        this.f96245OooOoOO = str;
        this.f96246OooOoo0 = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27472o00OOoo(this.f96245OooOoOO, this.f96246OooOoo0, continuation, this.f96243OooOoO);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27472o00OOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r4.OooOOoo(r3, r2, r23) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0oo;
        Image item;
        String id;
        Object objOooO0oo2;
        Image image;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96244OooOoO0;
        String str = this.f96246OooOoo0;
        C27449o00O0OoO c27449o00O0OoO = this.f96243OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C26515OooooO0 c26515OooooO0 = c27449o00O0OoO.f96052OooOOoo;
            this.f96244OooOoO0 = 1;
            objOooO0oo = c26515OooooO0.OooO0oo(this.f96245OooOoOO, str, this);
            if (objOooO0oo != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            str = this.f96241OooOo;
            c27449o00O0OoO = this.f96242OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO0oo2 = obj;
            image = (Image) objOooO0oo2;
            if (image != null) {
                Image imageCopy$default = Image.copy$default(image, null, null, null, null, null, 0.0f, 0L, 0L, false, 255, null);
                C26596o00O0o0 c26596o00O0o0 = c27449o00O0OoO.f96047OooOOO0;
                List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(imageCopy$default);
                this.f96242OooOo0o = null;
                this.f96241OooOo = null;
                this.f96244OooOoO0 = 3;
            }
            return null;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooO0oo = obj;
        DualLinkRef dualLinkRef = (DualLinkRef) objOooO0oo;
        if (dualLinkRef != null && (item = dualLinkRef.getItem()) != null && (id = item.getId()) != null) {
            C26596o00O0o0 c26596o00O0o02 = c27449o00O0OoO.f96047OooOOO0;
            this.f96242OooOo0o = c27449o00O0OoO;
            this.f96241OooOo = str;
            this.f96244OooOoO0 = 2;
            objOooO0oo2 = c26596o00O0o02.OooO0oo(id, str, this);
            if (objOooO0oo2 != enumC32485OooO00o) {
                image = (Image) objOooO0oo2;
                if (image != null) {
                }
            }
            return enumC32485OooO00o;
        }
        return null;
    }
}
