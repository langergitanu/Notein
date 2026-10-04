package o0Ooo00;

import com.orion.notein.domain.models.note.NoteContent;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0Ooo00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29324OooO00o<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f104004OooOo0o;

    /* JADX INFO: renamed from: o0Ooo00.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.viewmodel.AerialViewPagesViewModel$_noteContent$lambda$3$$inlined$map$1$2", m80623f = "AerialViewPagesViewModel.kt", m80624l = {50}, m80625m = "emit")
    public static final class C19982OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f104005OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f104006OooOo0o;

        public C19982OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f104006OooOo0o = obj;
            this.f104005OooOo |= Integer.MIN_VALUE;
            return C29324OooO00o.this.emit(null, this);
        }
    }

    public C29324OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
        this.f104004OooOo0o = interfaceC33723OooO0oO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        C19982OooO00o c19982OooO00o;
        if (continuation instanceof C19982OooO00o) {
            c19982OooO00o = (C19982OooO00o) continuation;
            int i = c19982OooO00o.f104005OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19982OooO00o.f104005OooOo = i - Integer.MIN_VALUE;
            } else {
                c19982OooO00o = new C19982OooO00o(continuation);
            }
        }
        Object obj2 = c19982OooO00o.f104006OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c19982OooO00o.f104005OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            NoteContent noteContent = (NoteContent) obj;
            if (noteContent == null) {
                noteContent = new NoteContent(null, null, null, null, null, null, 0, null, 0.0f, 0.0f, 0.0f, false, 0L, 0L, null, 32767, null);
            }
            c19982OooO00o.f104005OooOo = 1;
            if (this.f104004OooOo0o.emit(noteContent, c19982OooO00o) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
