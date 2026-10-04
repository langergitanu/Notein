package o0OoO0oo;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OoO0oo.o000Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28805o000Oooo<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooO0OO f101993OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f101994OooOo0o;

    /* JADX INFO: renamed from: o0OoO0oo.o000Oooo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$getRulerStateCache$$inlined$map$1$2", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f101995OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f101996OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f101996OooOo0o = obj;
            this.f101995OooOo |= Integer.MIN_VALUE;
            return C28805o000Oooo.this.emit(null, this);
        }
    }

    public C28805o000Oooo(InterfaceC33723OooO0oO interfaceC33723OooO0oO, com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO) {
        this.f101994OooOo0o = interfaceC33723OooO0oO;
        this.f101993OooOo = oooO0OO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f101995OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f101995OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f101996OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f101995OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            Object objOooO0OO = ((AbstractC24338OooO0o0) obj).OooO0OO(this.f101993OooOo.f73398Ooooo00);
            oooO00o.f101995OooOo = 1;
            if (this.f101994OooOo0o.emit(objOooO0OO, oooO00o) == enumC32485OooO00o) {
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
