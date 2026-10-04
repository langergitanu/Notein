package o0o00oOo;

import android.util.Log;
import com.google.firebase.messaging.Constants;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOo0o.C27600o0ooOO0;
import o0OOoOo0.C27802OooOO0O;
import o0OOoOo0.C27803OooOO0o;
import o0OOoOo0.C27804OooOOO;
import o0OOoOo0.C27819OooOoo;
import o0Oo0ooO.C28422OooOOo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o00oOo.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$_foldersInCurrentFolder$1", m80623f = "NoteListViewModel.kt", m80624l = {494}, m80625m = "invokeSuspend")
public final class C30054Oooo00O extends AbstractC32476OooO implements oO0O000o.OooOo00<C32443OooOOO<? extends NoteVO, ? extends NoteVO>, String, Integer, Integer, Integer, Continuation<? super InterfaceC33721OooO0o<? extends List<? extends Folder>>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f106885OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public NoteVO f106886OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f106887OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f106888OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f106889OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ int f106890OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ String f106891OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public /* synthetic */ int f106892OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public /* synthetic */ int f106893OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f106894Oooo000;

    /* JADX INFO: renamed from: o0o00oOo.Oooo00O$OooO00o */
    public static final class OooO00o implements InterfaceC33721OooO0o<List<? extends Folder>> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ int f106895OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o f106896OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ int f106897OooOoO0;

        /* JADX INFO: renamed from: o0o00oOo.Oooo00O$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20035OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ int f106898OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f106899OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ int f106900OooOoO0;

            /* JADX INFO: renamed from: o0o00oOo.Oooo00O$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$_foldersInCurrentFolder$1$invokeSuspend$$inlined$map$1$2", m80623f = "NoteListViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C20036OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f106901OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f106902OooOo0o;

                public C20036OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f106902OooOo0o = obj;
                    this.f106901OooOo |= Integer.MIN_VALUE;
                    return C20035OooO00o.this.emit(null, this);
                }
            }

            public C20035OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, int i, int i2) {
                this.f106899OooOo0o = interfaceC33723OooO0oO;
                this.f106898OooOo = i;
                this.f106900OooOoO0 = i2;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C20036OooO00o c20036OooO00o;
                int i;
                Integer coverColor;
                if (continuation instanceof C20036OooO00o) {
                    c20036OooO00o = (C20036OooO00o) continuation;
                    int i2 = c20036OooO00o.f106901OooOo;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c20036OooO00o.f106901OooOo = i2 - Integer.MIN_VALUE;
                    } else {
                        c20036OooO00o = new C20036OooO00o(continuation);
                    }
                }
                Object obj2 = c20036OooO00o.f106902OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i3 = c20036OooO00o.f106901OooOo;
                if (i3 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (T t : (List) obj) {
                        Folder folder = (Folder) t;
                        if (this.f106898OooOo != 3 || (i = this.f106900OooOoO0) == 0 || ((coverColor = folder.getCoverColor()) != null && i == coverColor.intValue())) {
                            arrayList.add(t);
                        }
                    }
                    c20036OooO00o.f106901OooOo = 1;
                    if (this.f106899OooOo0o.emit(arrayList, c20036OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO00o(InterfaceC33721OooO0o interfaceC33721OooO0o, int i, int i2) {
            this.f106896OooOo0o = interfaceC33721OooO0o;
            this.f106895OooOo = i;
            this.f106897OooOoO0 = i2;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super List<? extends Folder>> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f106896OooOo0o.collect(new C20035OooO00o(interfaceC33723OooO0oO, this.f106895OooOo, this.f106897OooOoO0), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30054Oooo00O(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, Continuation<? super C30054Oooo00O> continuation) {
        super(6, continuation);
        this.f106894Oooo000 = oooO0OO;
    }

    @Override // oO0O000o.OooOo00
    public final Object Oooo0OO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Serializable serializable) {
        int iIntValue = ((Number) obj3).intValue();
        int iIntValue2 = ((Number) obj4).intValue();
        int iIntValue3 = ((Number) obj5).intValue();
        C30054Oooo00O c30054Oooo00O = new C30054Oooo00O(this.f106894Oooo000, (Continuation) serializable);
        c30054Oooo00O.f106889OooOoOO = (C32443OooOOO) obj;
        c30054Oooo00O.f106891OooOoo0 = (String) obj2;
        c30054Oooo00O.f106890OooOoo = iIntValue;
        c30054Oooo00O.f106892OooOooO = iIntValue2;
        c30054Oooo00O.f106893OooOooo = iIntValue3;
        return c30054Oooo00O.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String str;
        InterfaceC33721OooO0o interfaceC33721OooO0oOooO;
        Object objOooOOo;
        NoteVO noteVO;
        long j;
        InterfaceC33721OooO0o interfaceC33721OooO0o;
        String str2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f106887OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f106889OooOoOO;
            String userId = this.f106891OooOoo0;
            int i2 = this.f106890OooOoo;
            int i3 = this.f106892OooOooO;
            int i4 = this.f106893OooOooo;
            NoteVO noteVO2 = (NoteVO) c32443OooOOO.f116638OooOo0o;
            com.orion.notein.p607ui.notelist.OooO0OO oooO0OO = this.f106894Oooo000;
            String str3 = (String) oooO0OO.f77151Oooo00O.getValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            str = "NoteListViewModel";
            Log.d("NoteListViewModel", "start load folders, folder: " + noteVO2 + ", root: " + str3);
            C27819OooOoo c27819OooOoo = oooO0OO.f77134OooOOo0;
            if (i4 != 0) {
                int i5 = ((C28422OooOOo) ((List) oooO0OO.f77153Oooo0O0.f121747OooOo0o.getValue()).get(i4)).f100769OooO00o;
                c27819OooOoo.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
                return C25252OooO0Oo.OooOoO(C25252OooO0Oo.OooOoO(c27819OooOoo.f98267OooO00o.OooO0oo(i5), new C27802OooOO0O(null, c27819OooOoo)), new C27803OooOO0o(null, c27819OooOoo));
            }
            C27600o0ooOO0 c27600o0ooOO0 = oooO0OO.f77124OooO0oO;
            if (noteVO2 != null) {
                interfaceC33721OooO0oOooO = c27600o0ooOO0.OooO(noteVO2.getId());
            } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(str3, NoteMeta.PROPERTY_FAVORITE)) {
                interfaceC33721OooO0oOooO = c27600o0ooOO0.OooO0OO();
            } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(str3, Constants.ScionAnalytics.PARAM_LABEL)) {
                long jLongValue = ((Number) oooO0OO.f77152Oooo00o.getValue()).longValue();
                c27819OooOoo.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
                interfaceC33721OooO0oOooO = C25252OooO0Oo.OooOoO(c27819OooOoo.f98267OooO00o.OooO0oO(com.facebook.soloader.OooOo.OooO0oO(Long.valueOf(jLongValue))), new C27804OooOOO(null, c27819OooOoo));
            } else {
                interfaceC33721OooO0oOooO = c27600o0ooOO0.OooO(null);
            }
            OooO00o oooO00o = new OooO00o(interfaceC33721OooO0oOooO, i3, i2);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            this.f106889OooOoOO = oooO00o;
            this.f106891OooOoo0 = str3;
            this.f106886OooOo0o = noteVO2;
            this.f106885OooOo = "NoteListViewModel";
            this.f106888OooOoO0 = jCurrentTimeMillis2;
            this.f106887OooOoO = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(oooO00o, this);
            if (objOooOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            noteVO = noteVO2;
            j = jCurrentTimeMillis2;
            interfaceC33721OooO0o = oooO00o;
            str2 = str3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.f106888OooOoO0;
            String str4 = this.f106885OooOo;
            noteVO = this.f106886OooOo0o;
            str2 = this.f106891OooOoo0;
            interfaceC33721OooO0o = (InterfaceC33721OooO0o) this.f106889OooOoOO;
            C32446OooOOOo.OooO0O0(obj);
            str = str4;
            objOooOOo = obj;
        }
        Log.d(str, "load folders cost: " + j + ", folder: " + noteVO + ", root: " + str2 + ", folders size: " + ((List) objOooOOo).size());
        return interfaceC33721OooO0o;
    }
}
