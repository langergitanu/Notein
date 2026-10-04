package o0OoO0oo;

import com.orion.notein.domain.models.note.NoteContent;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0OoO.C33799OooOO0O;

/* JADX INFO: loaded from: classes10.dex */
public final class o00O000 implements InterfaceC33721OooO0o<List<? extends NoteContent>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33799OooOO0O f102093OooOo0o;

    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f102094OooOo0o;

        /* JADX INFO: renamed from: o0OoO0oo.o00O000$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$special$$inlined$map$1$2", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19936OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f102095OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f102096OooOo0o;

            public C19936OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f102096OooOo0o = obj;
                this.f102095OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f102094OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19936OooO00o c19936OooO00o;
            if (continuation instanceof C19936OooO00o) {
                c19936OooO00o = (C19936OooO00o) continuation;
                int i = c19936OooO00o.f102095OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19936OooO00o.f102095OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19936OooO00o = new C19936OooO00o(continuation);
                }
            }
            Object obj2 = c19936OooO00o.f102096OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19936OooO00o.f102095OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                List listOoooOO0 = oOo000Oo.OooOOO.OoooOO0((NoteContent[]) obj);
                c19936OooO00o.f102095OooOo = 1;
                if (this.f102094OooOo0o.emit(listOoooOO0, c19936OooO00o) == enumC32485OooO00o) {
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

    public o00O000(C33799OooOO0O c33799OooOO0O) {
        this.f102093OooOo0o = c33799OooOO0O;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends NoteContent>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f102093OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
