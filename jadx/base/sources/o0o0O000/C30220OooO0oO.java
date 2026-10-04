package o0o0O000;

import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.domain.models.folder.Folder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOo0o.C27600o0ooOO0;
import o0OOo0oo.o0ooOOo;
import o0OOoooO.C27996OooO00o;
import o0oOoOo.C31040OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0o0O000.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lo0o0O000/OooO0oO;", "Landroidx/lifecycle/Ooooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C30220OooO0oO extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C33769Ooooo0o f107643OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27600o0ooOO0 f107644OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C33781o00o0O f107645OooO0o = C33784o00ooo.OooO00o(null);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0ooOOo f107646OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C33781o00o0O f107647OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33781o00o0O f107648OooO0oo;

    /* JADX INFO: renamed from: o0o0O000.OooO0oO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.FolderCreationViewModel$1", m80623f = "FolderCreationViewModel.kt", m80624l = {35, 43}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107650OooOo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C30220OooO0oO.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        
            if (oO00ooO.C32460OooOooO.f116667OooO00o == r1) goto L27;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107650OooOo0o;
            C30220OooO0oO c30220OooO0oO = C30220OooO0oO.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27600o0ooOO0 c27600o0ooOO0 = c30220OooO0oO.f107644OooO0Oo;
                this.f107650OooOo0o = 1;
                c27600o0ooOO0.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0OOo0o.o0ooOOo(c27600o0ooOO0, null), this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            List listO00Oo0 = oOo000Oo.OooOo.o00Oo0((Iterable) obj, 7);
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listO00Oo0, 10));
            int i2 = 0;
            for (Object obj2 : listO00Oo0) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                arrayList.add(new C31040OooOO0o(((Number) obj2).intValue(), i2 == 0));
                i2 = i3;
            }
            C33781o00o0O c33781o00o0O = c30220OooO0oO.f107647OooO0oO;
            this.f107650OooOo0o = 2;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, arrayList);
        }
    }

    /* JADX INFO: renamed from: o0o0O000.OooO0oO$OooO0O0 */
    public static final class OooO0O0 implements InterfaceC33721OooO0o<Integer> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33781o00o0O f107651OooOo0o;

        /* JADX INFO: renamed from: o0o0O000.OooO0oO$OooO0O0$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f107652OooOo0o;

            /* JADX INFO: renamed from: o0o0O000.OooO0oO$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.FolderCreationViewModel$special$$inlined$map$1$2", m80623f = "FolderCreationViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C20051OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f107653OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f107654OooOo0o;

                public C20051OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f107654OooOo0o = obj;
                    this.f107653OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f107652OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C20051OooO00o c20051OooO00o;
                T next;
                if (continuation instanceof C20051OooO00o) {
                    c20051OooO00o = (C20051OooO00o) continuation;
                    int i = c20051OooO00o.f107653OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c20051OooO00o.f107653OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c20051OooO00o = new C20051OooO00o(continuation);
                    }
                }
                Object obj2 = c20051OooO00o.f107654OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c20051OooO00o.f107653OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    Iterator<T> it = ((List) obj).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = (T) null;
                            break;
                        }
                        next = it.next();
                        if (((C31040OooOO0o) next).f110822OooO0O0) {
                            break;
                        }
                    }
                    C31040OooOO0o c31040OooOO0o = next;
                    Integer num = new Integer(c31040OooOO0o != null ? c31040OooOO0o.f110821OooO00o : C27996OooO00o.f99274OooO00o);
                    c20051OooO00o.f107653OooOo = 1;
                    if (this.f107652OooOo0o.emit(num, c20051OooO00o) == enumC32485OooO00o) {
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

        public OooO0O0(C33781o00o0O c33781o00o0O) {
            this.f107651OooOo0o = c33781o00o0O;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super Integer> interfaceC33723OooO0oO, Continuation continuation) {
            this.f107651OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
            return EnumC32485OooO00o.f116726OooOo0o;
        }
    }

    public C30220OooO0oO(C27600o0ooOO0 c27600o0ooOO0, o0ooOOo o0ooooo2) {
        this.f107644OooO0Oo = c27600o0ooOO0;
        this.f107646OooO0o0 = o0ooooo2;
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(C34434OooOoO.f123453OooOo0o);
        this.f107647OooO0oO = c33781o00o0OOooO00o;
        this.f107648OooO0oo = c33781o00o0OOooO00o;
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, executorC33873OooO0O0, null, new OooO00o(null), 2);
        this.f107643OooO = C25252OooO0Oo.OooOoO0(new OooO0O0(c33781o00o0OOooO00o), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), Integer.valueOf(C27996OooO00o.f99274OooO00o));
    }

    public final void OooO0o(int i) {
        C33781o00o0O c33781o00o0O = this.f107647OooO0oO;
        List list = (List) c33781o00o0O.getValue();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i2 = ((C31040OooOO0o) it.next()).f110821OooO00o;
            arrayList.add(i2 == i ? new C31040OooOO0o(i, true) : new C31040OooOO0o(i2, false));
        }
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ac, code lost:
    
        if (r12 != r0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30221OooO0oo c30221OooO0oo;
        int i;
        String id;
        String str2;
        C30220OooO0oO c30220OooO0oO;
        C30220OooO0oO c30220OooO0oO2;
        Iterator it;
        Object next;
        if (abstractC32479OooO0OO instanceof C30221OooO0oo) {
            c30221OooO0oo = (C30221OooO0oo) abstractC32479OooO0OO;
            int i2 = c30221OooO0oo.f107660OooOoOO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c30221OooO0oo.f107660OooOoOO = i2 - Integer.MIN_VALUE;
            } else {
                c30221OooO0oo = new C30221OooO0oo(this, abstractC32479OooO0OO);
            }
        }
        C30221OooO0oo c30221OooO0oo2 = c30221OooO0oo;
        Object objOooO0Oo = c30221OooO0oo2.f107659OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c30221OooO0oo2.f107660OooOoOO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            String str3 = (String) this.f107645OooO0o.getValue();
            if (str3 != null) {
                c30221OooO0oo2.f107657OooOo0o = this;
                c30221OooO0oo2.f107656OooOo = str;
                c30221OooO0oo2.f107660OooOoOO = 1;
                objOooO0Oo = this.f107644OooO0Oo.OooO0Oo(str3, c30221OooO0oo2);
                if (objOooO0Oo != enumC32485OooO00o) {
                    c30220OooO0oO2 = this;
                }
                return enumC32485OooO00o;
            }
            i = 2;
            id = null;
            str2 = str;
            c30220OooO0oO = this;
            it = ((Iterable) c30220OooO0oO.f107647OooO0oO.getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C31040OooOO0o) next).f110822OooO0O0) {
                    break;
                }
            }
            C31040OooOO0o c31040OooOO0o = (C31040OooOO0o) next;
            int i4 = c31040OooOO0o == null ? c31040OooOO0o.f110821OooO00o : C27996OooO00o.f99274OooO00o;
            c30221OooO0oo2.f107657OooOo0o = c30220OooO0oO;
            c30221OooO0oo2.f107656OooOo = null;
            c30221OooO0oo2.f107660OooOoOO = i;
            objOooO0Oo = C27600o0ooOO0.OooO0O0(c30220OooO0oO.f107644OooO0Oo, str2, id, null, 0L, i4, c30221OooO0oo2, 12);
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c30220OooO0oO = c30221OooO0oo2.f107657OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                String str4 = (String) objOooO0Oo;
                c30220OooO0oO.f107646OooO0o0.OooO0OO(com.facebook.soloader.OooOo.OooO0oO(str4));
                return str4;
            }
            str = c30221OooO0oo2.f107656OooOo;
            c30220OooO0oO2 = c30221OooO0oo2.f107657OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
        }
        Folder folder = (Folder) objOooO0Oo;
        if (folder != null) {
            id = folder.getId();
            i = 2;
        } else {
            i = 2;
            id = null;
        }
        str2 = str;
        c30220OooO0oO = c30220OooO0oO2;
        it = ((Iterable) c30220OooO0oO.f107647OooO0oO.getValue()).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        C31040OooOO0o c31040OooOO0o2 = (C31040OooOO0o) next;
        int i42 = c31040OooOO0o2 == null ? c31040OooOO0o2.f110821OooO00o : C27996OooO00o.f99274OooO00o;
        c30221OooO0oo2.f107657OooOo0o = c30220OooO0oO;
        c30221OooO0oo2.f107656OooOo = null;
        c30221OooO0oo2.f107660OooOoOO = i;
        objOooO0Oo = C27600o0ooOO0.OooO0O0(c30220OooO0oO.f107644OooO0Oo, str2, id, null, 0L, i42, c30221OooO0oo2, 12);
    }
}
