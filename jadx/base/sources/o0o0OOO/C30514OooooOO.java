package o0o0OOO;

import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0OOO.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$addPageToNote$2", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {2071, 2089}, m80625m = "invokeSuspend")
public final class C30514OooooOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Page f108951OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f108952OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f108953OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f108954OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C30520o000000o f108955OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f108956OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f108957OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30514OooooOO(C30520o000000o c30520o000000o, String str, String str2, Continuation<? super C30514OooooOO> continuation) {
        super(2, continuation);
        this.f108955OooOoOO = c30520o000000o;
        this.f108957OooOoo0 = str;
        this.f108956OooOoo = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C30514OooooOO c30514OooooOO = new C30514OooooOO(this.f108955OooOoOO, this.f108957OooOoo0, this.f108956OooOoo, continuation);
        c30514OooooOO.f108953OooOoO = obj;
        return c30514OooooOO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C30514OooooOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ca, code lost:
    
        if (r2.OooO0OO(r11, r1, r7, r10) == r0) goto L56;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO00o;
        C30520o000000o c30520o000000o;
        String str;
        Page pageOooO0o0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108954OooOoO0;
        try {
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c30520o000000o = this.f108955OooOoOO;
            String str2 = this.f108957OooOoo0;
            str = this.f108956OooOoo;
            pageOooO0o0 = C30520o000000o.OooO0o0(c30520o000000o, str2);
            if (pageOooO0o0 == null) {
                return Boolean.FALSE;
            }
            C27449o00O0OoO c27449o00O0OoO = c30520o000000o.f109005OooOO0O;
            this.f108953OooOoO = c30520o000000o;
            this.f108952OooOo0o = str;
            this.f108951OooOo = pageOooO0o0;
            this.f108954OooOoO0 = 1;
            obj = c27449o00O0OoO.OooOoO0(str2, this);
            if (obj == enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO00o = Boolean.TRUE;
            return C32445OooOOOO.OooO00o(objOooO00o) == null ? objOooO00o : Boolean.FALSE;
        }
        pageOooO0o0 = this.f108951OooOo;
        str = this.f108952OooOo0o;
        c30520o000000o = (C30520o000000o) this.f108953OooOoO;
        C32446OooOOOo.OooO0O0(obj);
        NoteContent noteContent = (NoteContent) obj;
        if (noteContent == null) {
            return Boolean.FALSE;
        }
        int iIntValue = ((Number) c30520o000000o.f109019OooOoO.getValue()).intValue();
        int i2 = 0;
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                Iterator<Page> it = noteContent.getPages().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(it.next().getId(), str)) {
                        break;
                    }
                    i2++;
                }
                if (i2 == -1) {
                    return Boolean.FALSE;
                }
                i2++;
            } else {
                Iterator<Page> it2 = noteContent.getPages().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(it2.next().getId(), str)) {
                        break;
                    }
                    i2++;
                }
                if (i2 == -1) {
                    return Boolean.FALSE;
                }
            }
        }
        C27449o00O0OoO c27449o00O0OoO2 = c30520o000000o.f109005OooOO0O;
        this.f108953OooOoO = null;
        this.f108952OooOo0o = null;
        this.f108951OooOo = null;
        this.f108954OooOoO0 = 2;
    }
}
