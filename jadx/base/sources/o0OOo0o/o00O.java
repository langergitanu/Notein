package o0OOo0o;

import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOO0OO.C27021OooOoOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes9.dex */
public final class o00O implements InterfaceC33721OooO0o<List<? extends Page>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f95866OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C27021OooOoOO f95867OooOo0o;

    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ ArrayList f95868OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f95869OooOo0o;

        /* JADX INFO: renamed from: o0OOo0o.o00O$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$getSortedPagesByNoteId$$inlined$map$1$2", m80623f = "NoteUseCase.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19862OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f95870OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f95871OooOo0o;

            public C19862OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f95871OooOo0o = obj;
                this.f95870OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, ArrayList arrayList) {
            this.f95869OooOo0o = interfaceC33723OooO0oO;
            this.f95868OooOo = arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19862OooO00o c19862OooO00o;
            ArrayList arrayList;
            if (continuation instanceof C19862OooO00o) {
                c19862OooO00o = (C19862OooO00o) continuation;
                int i = c19862OooO00o.f95870OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19862OooO00o.f95870OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19862OooO00o = new C19862OooO00o(continuation);
                }
            }
            Object obj2 = c19862OooO00o.f95871OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19862OooO00o.f95870OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = ((List) obj).iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    arrayList = this.f95868OooOo;
                    if (!zHasNext) {
                        break;
                    }
                    T next = it.next();
                    if (arrayList.contains(((Page) next).getId())) {
                        arrayList2.add(next);
                    }
                }
                List listO00O0O = oOo000Oo.OooOo.o00O0O(arrayList2, new o00OO000(arrayList));
                c19862OooO00o.f95870OooOo = 1;
                if (this.f95869OooOo0o.emit(listO00O0O, c19862OooO00o) == enumC32485OooO00o) {
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

    public o00O(C27021OooOoOO c27021OooOoOO, ArrayList arrayList) {
        this.f95867OooOo0o = c27021OooOoOO;
        this.f95866OooOo = arrayList;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends Page>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f95867OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f95866OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
