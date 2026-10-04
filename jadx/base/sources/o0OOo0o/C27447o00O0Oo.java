package o0OOo0o;

import com.orion.notein.domain.models.note.NoteContent;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OOo0o.o00O0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27447o00O0Oo<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96023OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f96024OooOo0o;

    /* JADX INFO: renamed from: o0OOo0o.o00O0Oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$getNoteContentById$$inlined$map$1$2", m80623f = "NoteUseCase.kt", m80624l = {51, 50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f96025OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f96026OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public InterfaceC33723OooO0oO f96028OooOoO0;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f96026OooOo0o = obj;
            this.f96025OooOo |= Integer.MIN_VALUE;
            return C27447o00O0Oo.this.emit(null, this);
        }
    }

    public C27447o00O0Oo(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C27449o00O0OoO c27449o00O0OoO) {
        this.f96024OooOo0o = interfaceC33723OooO0oO;
        this.f96023OooOo = c27449o00O0OoO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r9.emit(r8, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        NoteContent noteContent;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO2;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f96025OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f96025OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f96026OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f96025OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            NoteContent noteContent2 = (NoteContent) obj;
            interfaceC33723OooO0oO = this.f96024OooOo0o;
            if (noteContent2 != null) {
                oooO00o.f96028OooOoO0 = interfaceC33723OooO0oO;
                oooO00o.f96025OooOo = 1;
                Object objOooO0o = this.f96023OooOo.OooO0o(noteContent2, oooO00o);
                if (objOooO0o != enumC32485OooO00o) {
                    obj2 = objOooO0o;
                    interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                }
                return enumC32485OooO00o;
            }
            noteContent = null;
            oooO00o.f96028OooOoO0 = null;
            oooO00o.f96025OooOo = 2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj2);
                return C32460OooOooO.f116667OooO00o;
            }
            interfaceC33723OooO0oO2 = oooO00o.f96028OooOoO0;
            C32446OooOOOo.OooO0O0(obj2);
        }
        NoteContent noteContent3 = (NoteContent) obj2;
        interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
        noteContent = noteContent3;
        oooO00o.f96028OooOoO0 = null;
        oooO00o.f96025OooOo = 2;
    }
}
