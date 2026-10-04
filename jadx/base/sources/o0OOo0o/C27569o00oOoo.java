package o0OOo0o;

import com.orion.notein.domain.models.page.DualLinkRef;
import com.orion.notein.domain.models.page.DualLinkSource;
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

/* JADX INFO: renamed from: o0OOo0o.o00oOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$deleteDualLinkSource$2", m80623f = "NoteUseCase.kt", m80624l = {738, 742, 744}, m80625m = "invokeSuspend")
public final class C27569o00oOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96735OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96736OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f96737OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f96738OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27569o00oOoo(String str, String str2, Continuation continuation, C27449o00O0OoO c27449o00O0OoO) {
        super(2, continuation);
        this.f96735OooOo = c27449o00O0OoO;
        this.f96738OooOoO0 = str;
        this.f96737OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27569o00oOoo(this.f96738OooOoO0, this.f96737OooOoO, continuation, this.f96735OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27569o00oOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        if (r2.OooO0o(r3, r4, r23) != r1) goto L35;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooOOO0;
        DualLinkRef ref;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96736OooOo0o;
        String str = this.f96738OooOoO0;
        String str2 = this.f96737OooOoO;
        C27449o00O0OoO c27449o00O0OoO = this.f96735OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C26515OooooO0 c26515OooooO0 = c27449o00O0OoO.f96052OooOOoo;
            this.f96736OooOo0o = 1;
            objOooOOO0 = c26515OooooO0.OooOOO0(str, str2, this);
            if (objOooOOO0 != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            objOooOOO0 = obj;
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
            this.f96736OooOo0o = 3;
        }
        DualLinkSource dualLinkSource = (DualLinkSource) objOooOOO0;
        if (dualLinkSource != null && (ref = dualLinkSource.getRef()) != null) {
            DualLinkRef ref2 = dualLinkSource.getRef();
            Image item = ref2 != null ? ref2.getItem() : null;
            if (item != null) {
                C26596o00O0o0 c26596o00O0o0 = c27449o00O0OoO.f96047OooOOO0;
                List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(Image.copy$default(item, null, ref.getPageId(), null, "default", null, 0.0f, 0L, 0L, false, 501, null));
                String noteId = ref.getNoteId();
                this.f96736OooOo0o = 2;
                if (c26596o00O0o0.OooOOoo(noteId, listOooO0oO, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            C26515OooooO0 c26515OooooO022 = c27449o00O0OoO.f96052OooOOoo;
            this.f96736OooOo0o = 3;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
