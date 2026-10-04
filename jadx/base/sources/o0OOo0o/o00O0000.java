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

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$deleteDualLinkRef$2", m80623f = "NoteUseCase.kt", m80624l = {753, 757, 760}, m80625m = "invokeSuspend")
public final class o00O0000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f95882OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95883OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f95884OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f95885OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0000(String str, String str2, Continuation continuation, C27449o00O0OoO c27449o00O0OoO) {
        super(2, continuation);
        this.f95882OooOo = c27449o00O0OoO;
        this.f95885OooOoO0 = str;
        this.f95884OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00O0000(this.f95885OooOoO0, this.f95884OooOoO, continuation, this.f95882OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o00O0000) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if (r2.OooO0OO(r3, r4, r23) != r1) goto L29;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0oo;
        Image item;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95883OooOo0o;
        String str = this.f95885OooOoO0;
        String str2 = this.f95884OooOoO;
        C27449o00O0OoO c27449o00O0OoO = this.f95882OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C26515OooooO0 c26515OooooO0 = c27449o00O0OoO.f96052OooOOoo;
            this.f95883OooOo0o = 1;
            objOooO0oo = c26515OooooO0.OooO0oo(str, str2, this);
            if (objOooO0oo != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            objOooO0oo = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            C26515OooooO0 c26515OooooO02 = c27449o00O0OoO.f96052OooOOoo;
            this.f95883OooOo0o = 3;
        }
        DualLinkRef dualLinkRef = (DualLinkRef) objOooO0oo;
        if (dualLinkRef != null && (item = dualLinkRef.getItem()) != null) {
            C26596o00O0o0 c26596o00O0o0 = c27449o00O0OoO.f96047OooOOO0;
            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(Image.copy$default(item, null, dualLinkRef.getPageId(), null, "default", null, 0.0f, 0L, 0L, false, 501, null));
            String noteId = dualLinkRef.getNoteId();
            this.f95883OooOo0o = 2;
            if (c26596o00O0o0.OooOOoo(noteId, listOooO0oO, this) != enumC32485OooO00o) {
                C26515OooooO0 c26515OooooO022 = c27449o00O0OoO.f96052OooOOoo;
                this.f95883OooOo0o = 3;
            }
            return enumC32485OooO00o;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
