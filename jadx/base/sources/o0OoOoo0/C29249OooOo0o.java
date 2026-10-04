package o0OoOoo0;

import com.orion.notein.domain.models.note.LatestOpenedNote;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.p607ui.p609vo.LatestOpenedNoteVO;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000OoO.C24536OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0OOoOo.C27783OooO;
import o0OOoOo.C27790OooO0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0OoO.C33799OooOO0O;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OoOoo0.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.editortab.LatestOpenedNoteViewModel$latestOpenedNoteVOs$1", m80623f = "LatestOpenedNoteViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29249OooOo0o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<String, String, Continuation<? super InterfaceC33721OooO0o<? extends List<? extends LatestOpenedNoteVO>>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ String f103722OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ String f103723OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C29250OooOoO0 f103724OooOoO0;

    /* JADX INFO: renamed from: o0OoOoo0.OooOo0o$OooO00o */
    public static final class OooO00o implements InterfaceC33721OooO0o<List<? extends LatestOpenedNoteVO>> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f103725OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33799OooOO0O f103726OooOo0o;

        /* JADX INFO: renamed from: o0OoOoo0.OooOo0o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19974OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ String f103727OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f103728OooOo0o;

            /* JADX INFO: renamed from: o0OoOoo0.OooOo0o$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.editortab.LatestOpenedNoteViewModel$latestOpenedNoteVOs$1$invokeSuspend$$inlined$map$1$2", m80623f = "LatestOpenedNoteViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19975OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f103729OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f103730OooOo0o;

                public C19975OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f103730OooOo0o = obj;
                    this.f103729OooOo |= Integer.MIN_VALUE;
                    return C19974OooO00o.this.emit(null, this);
                }
            }

            public C19974OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, String str) {
                this.f103728OooOo0o = interfaceC33723OooO0oO;
                this.f103727OooOo = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19975OooO00o c19975OooO00o;
                if (continuation instanceof C19975OooO00o) {
                    c19975OooO00o = (C19975OooO00o) continuation;
                    int i = c19975OooO00o.f103729OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19975OooO00o.f103729OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19975OooO00o = new C19975OooO00o(continuation);
                    }
                }
                Object obj2 = c19975OooO00o.f103730OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19975OooO00o.f103729OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    List listO00O0O = oOo000Oo.OooOo.o00O0O((List) obj, new OooO0O0());
                    List list = listO00O0O;
                    ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                    int i3 = 0;
                    for (T t : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            C34429OooOOo0.OooOOo();
                            throw null;
                        }
                        C32443OooOOO c32443OooOOO = (C32443OooOOO) t;
                        LatestOpenedNote latestOpenedNote = (LatestOpenedNote) c32443OooOOO.f116638OooOo0o;
                        NoteMeta noteMeta = (NoteMeta) c32443OooOOO.f116637OooOo;
                        C32443OooOOO c32443OooOOO2 = (C32443OooOOO) oOo000Oo.OooOo.OoooO00(i4, listO00O0O);
                        LatestOpenedNote latestOpenedNote2 = c32443OooOOO2 != null ? (LatestOpenedNote) c32443OooOOO2.f116638OooOo0o : null;
                        String noteId = latestOpenedNote.getNoteId();
                        String str = this.f103727OooOo;
                        arrayList.add(new LatestOpenedNoteVO(latestOpenedNote.getNoteId(), noteMeta.getTitle(), latestOpenedNote.getIndex(), kotlin.jvm.internal.OooOOO0.OooO0O0(latestOpenedNote.getNoteId(), str), !kotlin.jvm.internal.OooOOO0.OooO0O0(noteId, str) && (latestOpenedNote2 == null || !kotlin.jvm.internal.OooOOO0.OooO0O0(latestOpenedNote2.getNoteId(), str))));
                        i3 = i4;
                    }
                    c19975OooO00o.f103729OooOo = 1;
                    if (this.f103728OooOo0o.emit(arrayList, c19975OooO00o) == enumC32485OooO00o) {
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

        public OooO00o(C33799OooOO0O c33799OooOO0O, String str) {
            this.f103726OooOo0o = c33799OooOO0O;
            this.f103725OooOo = str;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super List<? extends LatestOpenedNoteVO>> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f103726OooOo0o.collect(new C19974OooO00o(interfaceC33723OooO0oO, this.f103725OooOo), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0OoOoo0.OooOo0o$OooO0O0 */
    public static final class OooO0O0<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Integer.valueOf(((LatestOpenedNote) ((C32443OooOOO) t).f116638OooOo0o).getIndex()), Integer.valueOf(((LatestOpenedNote) ((C32443OooOOO) t2).f116638OooOo0o).getIndex()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29249OooOo0o(C29250OooOoO0 c29250OooOoO0, Continuation<? super C29249OooOo0o> continuation) {
        super(3, continuation);
        this.f103724OooOoO0 = c29250OooOoO0;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(String str, String str2, Continuation<? super InterfaceC33721OooO0o<? extends List<? extends LatestOpenedNoteVO>>> continuation) {
        C29249OooOo0o c29249OooOo0o = new C29249OooOo0o(this.f103724OooOoO0, continuation);
        c29249OooOo0o.f103723OooOo0o = str;
        c29249OooOo0o.f103722OooOo = str2;
        return c29249OooOo0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        String str = this.f103723OooOo0o;
        String userId = this.f103722OooOo;
        C27783OooO c27783OooO = this.f103724OooOoO0.f103733OooO0Oo;
        c27783OooO.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
        return new OooO00o(C25252OooO0Oo.OooOoO(c27783OooO.f98146OooO00o.OooO00o(), new C27790OooO0oO(null, c27783OooO, userId)), str);
    }
}
