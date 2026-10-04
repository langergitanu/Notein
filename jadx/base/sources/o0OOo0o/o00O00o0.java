package o0OOo0o;

import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27309OooOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$duplicatePages$2", m80623f = "NoteUseCase.kt", m80624l = {406, 408, 411}, m80625m = "invokeSuspend")
public final class o00O00o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f95943OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public NoteContent f95944OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f95945OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f95946OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ List<String> f95947OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ int f95948OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00o0(C27449o00O0OoO c27449o00O0OoO, String str, List<String> list, int i, Continuation<? super o00O00o0> continuation) {
        super(2, continuation);
        this.f95946OooOoO0 = c27449o00O0OoO;
        this.f95945OooOoO = str;
        this.f95947OooOoOO = list;
        this.f95948OooOoo0 = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00O00o0(this.f95946OooOoO0, this.f95945OooOoO, this.f95947OooOoOO, this.f95948OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o00O00o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r7.f95946OooOoO0.OooO0oO(r7.f95947OooOoOO, r7.f95945OooOoO, r4, r7.f95948OooOoo0, r7) == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NoteContent noteContent;
        NoteMeta noteMeta;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95943OooOo;
        String str = this.f95945OooOoO;
        C27449o00O0OoO c27449o00O0OoO = this.f95946OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27309OooOoO interfaceC27309OooOoO = c27449o00O0OoO.f96035OooO00o;
            this.f95943OooOo = 1;
            obj = interfaceC27309OooOoO.OooOO0o(str, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            noteContent = this.f95944OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            noteMeta = (NoteMeta) obj;
            if (noteMeta != null) {
                return C32460OooOooO.f116667OooO00o;
            }
            Note noteOooO0O0 = o0oOO.OooO0O0(noteMeta, noteContent);
            this.f95944OooOo0o = null;
            this.f95943OooOo = 3;
        }
        noteContent = (NoteContent) obj;
        if (noteContent == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        String strOooO0Oo = c27449o00O0OoO.f96037OooO0OO.OooO0Oo();
        this.f95944OooOo0o = noteContent;
        this.f95943OooOo = 2;
        obj = c27449o00O0OoO.f96036OooO0O0.OooO0oo(str, strOooO0Oo, this);
        if (obj != enumC32485OooO00o) {
            noteMeta = (NoteMeta) obj;
            if (noteMeta != null) {
            }
        }
        return enumC32485OooO00o;
    }
}
