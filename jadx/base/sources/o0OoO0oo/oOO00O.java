package o0OoO0oo;

import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27323Oooo0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public final class oOO00O implements InterfaceC33721OooO0o<InterfaceC33721OooO0o<? extends C32443OooOOO<? extends String, ? extends Long>>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooO0OO f102680OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33769Ooooo0o f102681OooOo0o;

    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooO0OO f102682OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f102683OooOo0o;

        /* JADX INFO: renamed from: o0OoO0oo.oOO00O$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$special$$inlined$mapNotNull$1$2", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {55, 62}, m80625m = "emit")
        public static final class C19948OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f102684OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f102685OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public OooO00o f102687OooOoO0;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public InterfaceC33723OooO0oO f102688OooOoOO;

            /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
            public String f102689OooOoo0;

            public C19948OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f102685OooOo0o = obj;
                this.f102684OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO) {
            this.f102683OooOo0o = interfaceC33723OooO0oO;
            this.f102682OooOo = oooO0OO;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
        
            if (r2.emit(r6, r0) == r1) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19948OooO00o c19948OooO00o;
            InterfaceC33723OooO0oO interfaceC33723OooO0oO;
            C28831o000oooo c28831o000oooo;
            String id;
            OooO00o<T> oooO00o;
            if (continuation instanceof C19948OooO00o) {
                c19948OooO00o = (C19948OooO00o) continuation;
                int i = c19948OooO00o.f102684OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19948OooO00o.f102684OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19948OooO00o = new C19948OooO00o(continuation);
                }
            }
            Object objOooO0OO = c19948OooO00o.f102685OooOo0o;
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19948OooO00o.f102684OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0OO);
                NoteMeta noteMeta = (NoteMeta) obj;
                interfaceC33723OooO0oO = this.f102683OooOo0o;
                if (noteMeta == null || !noteMeta.getUnboundedNote()) {
                    c28831o000oooo = null;
                    if (c28831o000oooo != null) {
                        c19948OooO00o.f102687OooOoO0 = null;
                        c19948OooO00o.f102688OooOoOO = null;
                        c19948OooO00o.f102689OooOoo0 = null;
                        c19948OooO00o.f102684OooOo = 2;
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                id = noteMeta.getId();
                InterfaceC27323Oooo0oO interfaceC27323Oooo0oO = this.f102682OooOo.f73353OooO0oO;
                c19948OooO00o.f102687OooOoO0 = this;
                c19948OooO00o.f102688OooOoOO = interfaceC33723OooO0oO;
                c19948OooO00o.f102689OooOoo0 = id;
                c19948OooO00o.f102684OooOo = 1;
                objOooO0OO = interfaceC27323Oooo0oO.OooO0OO(id);
                if (objOooO0OO != obj2) {
                    oooO00o = this;
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0OO);
                return C32460OooOooO.f116667OooO00o;
            }
            id = c19948OooO00o.f102689OooOoo0;
            interfaceC33723OooO0oO = c19948OooO00o.f102688OooOoOO;
            oooO00o = c19948OooO00o.f102687OooOoO0;
            C32446OooOOOo.OooO0O0(objOooO0OO);
            c28831o000oooo = new C28831o000oooo((InterfaceC33721OooO0o) objOooO0OO, oooO00o.f102682OooOo, id);
            if (c28831o000oooo != null) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public oOO00O(C33769Ooooo0o c33769Ooooo0o, com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO) {
        this.f102681OooOo0o = c33769Ooooo0o;
        this.f102680OooOo = oooO0OO;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super InterfaceC33721OooO0o<? extends C32443OooOOO<? extends String, ? extends Long>>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f102681OooOo0o.f121747OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f102680OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
