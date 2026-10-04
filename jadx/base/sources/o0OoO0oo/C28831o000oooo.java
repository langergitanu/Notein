package o0OoO0oo;

import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OoO0oo.o000oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28831o000oooo implements InterfaceC33721OooO0o<C32443OooOOO<? extends String, ? extends Long>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooO0OO f102076OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f102077OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f102078OooOoO0;

    /* JADX INFO: renamed from: o0OoO0oo.o000oooo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooO0OO f102079OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f102080OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f102081OooOoO0;

        /* JADX INFO: renamed from: o0OoO0oo.o000oooo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$showTooManyStrokesWarning$lambda$17$$inlined$mapNotNull$1$2", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {57}, m80625m = "emit")
        public static final class C19934OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f102082OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f102083OooOo0o;

            public C19934OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f102083OooOo0o = obj;
                this.f102082OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO, String str) {
            this.f102080OooOo0o = interfaceC33723OooO0oO;
            this.f102079OooOo = oooO0OO;
            this.f102081OooOoO0 = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19934OooO00o c19934OooO00o;
            C32443OooOOO c32443OooOOO;
            if (continuation instanceof C19934OooO00o) {
                c19934OooO00o = (C19934OooO00o) continuation;
                int i = c19934OooO00o.f102082OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19934OooO00o.f102082OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19934OooO00o = new C19934OooO00o(continuation);
                }
            }
            Object obj2 = c19934OooO00o.f102083OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19934OooO00o.f102082OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                long jLongValue = ((Number) obj).longValue();
                if (jLongValue >= 10000) {
                    com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO = this.f102079OooOo;
                    ConcurrentSkipListSet<String> concurrentSkipListSet = oooO0OO.f73432o0ooOO0;
                    String str = this.f102081OooOoO0;
                    if (concurrentSkipListSet.contains(str)) {
                        c32443OooOOO = null;
                    } else {
                        oooO0OO.f73432o0ooOO0.add(str);
                        c32443OooOOO = new C32443OooOOO(str, new Long(jLongValue));
                    }
                    if (c32443OooOOO != null) {
                        c19934OooO00o.f102082OooOo = 1;
                        if (this.f102080OooOo0o.emit(c32443OooOOO, c19934OooO00o) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    }
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

    public C28831o000oooo(InterfaceC33721OooO0o interfaceC33721OooO0o, com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO, String str) {
        this.f102077OooOo0o = interfaceC33721OooO0o;
        this.f102076OooOo = oooO0OO;
        this.f102078OooOoO0 = str;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super C32443OooOOO<? extends String, ? extends Long>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f102077OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f102076OooOo, this.f102078OooOoO0), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
