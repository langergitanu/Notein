package o0OOo0o;

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
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OOo0o.o000oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$batchMovePageToTrashBin$2", m80623f = "NoteUseCase.kt", m80624l = {831, 833, 835}, m80625m = "invokeSuspend")
public final class C27430o000oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f95778OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public NoteContent f95779OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f95780OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f95781OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ List<String> f95782OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27430o000oo(C27449o00O0OoO c27449o00O0OoO, String str, List<String> list, Continuation<? super C27430o000oo> continuation) {
        super(2, continuation);
        this.f95781OooOoO0 = c27449o00O0OoO;
        this.f95780OooOoO = str;
        this.f95782OooOoOO = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27430o000oo(this.f95781OooOoO0, this.f95780OooOoO, this.f95782OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27430o000oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r13 != r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        NoteContent noteContent;
        NoteContent noteContent2;
        NoteMeta noteMeta;
        Object objOooO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95778OooOo;
        String str = this.f95780OooOoO;
        C27449o00O0OoO c27449o00O0OoO = this.f95781OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27309OooOoO interfaceC27309OooOoO = c27449o00O0OoO.f96035OooO00o;
            this.f95778OooOo = 1;
            obj = interfaceC27309OooOoO.OooOO0o(str, this);
            if (obj != enumC32485OooO00o) {
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
            noteContent = this.f95779OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            noteContent2 = noteContent;
            noteMeta = (NoteMeta) obj;
            if (noteContent2 != null && noteMeta != null) {
                this.f95779OooOo0o = null;
                this.f95778OooOo = 3;
                c27449o00O0OoO.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27436o000ooO0(this.f95782OooOoOO, noteContent2, c27449o00O0OoO, noteMeta, null), this);
                if (objOooO0o != enumC32485OooO00o) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        noteContent = (NoteContent) obj;
        String strOooO0Oo = c27449o00O0OoO.f96037OooO0OO.OooO0Oo();
        this.f95779OooOo0o = noteContent;
        this.f95778OooOo = 2;
        obj = c27449o00O0OoO.f96036OooO0O0.OooO0oo(str, strOooO0Oo, this);
        if (obj != enumC32485OooO00o) {
            noteContent2 = noteContent;
            noteMeta = (NoteMeta) obj;
            if (noteContent2 != null) {
                this.f95779OooOo0o = null;
                this.f95778OooOo = 3;
                c27449o00O0OoO.getClass();
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27436o000ooO0(this.f95782OooOoOO, noteContent2, c27449o00O0OoO, noteMeta, null), this);
                if (objOooO0o != enumC32485OooO00o) {
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        return enumC32485OooO00o;
    }
}
