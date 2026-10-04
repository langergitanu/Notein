package o0OoOoo0;

import com.orion.notein.p607ui.p609vo.LatestOpenedNoteVO;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.coroutines.Continuation;
import o000OoO.C24536OooO0Oo;
import o0OOoOo.C27787OooO0Oo;
import o0OOoOo.C27788OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoOoo0.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.editortab.LatestOpenedNoteViewModel$deleteLatestOpenedNote$2", m80623f = "LatestOpenedNoteViewModel.kt", m80624l = {129}, m80625m = "invokeSuspend")
public final class C29247OooOo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f103715OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f103716OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f103717OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C29250OooOoO0 f103718OooOoO0;

    /* JADX INFO: renamed from: o0OoOoo0.OooOo00$OooO00o */
    public static final class OooO00o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Integer.valueOf(((LatestOpenedNoteVO) t).getIndex()), Integer.valueOf(((LatestOpenedNoteVO) t2).getIndex()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29247OooOo00(C29250OooOoO0 c29250OooOoO0, String str, Continuation<? super C29247OooOo00> continuation) {
        super(2, continuation);
        this.f103718OooOoO0 = c29250OooOoO0;
        this.f103717OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29247OooOo00(this.f103718OooOoO0, this.f103717OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C29247OooOo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object next;
        String noteId;
        Object next2;
        Object objPrevious;
        Object next3;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f103715OooOo;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = this.f103716OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return str2;
        }
        C32446OooOOOo.OooO0O0(obj);
        C29250OooOoO0 c29250OooOoO0 = this.f103718OooOoO0;
        List listO00O0O = oOo000Oo.OooOo.o00O0O(oOo000Oo.OooOo.o0ooOO0((Iterable) c29250OooOoO0.f103732OooO.f121747OooOo0o.getValue()), new OooO00o());
        List list = listO00O0O;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            str = this.f103717OooOoO;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((LatestOpenedNoteVO) next).getNoteId(), str)) {
                break;
            }
        }
        LatestOpenedNoteVO latestOpenedNoteVO = (LatestOpenedNoteVO) next;
        if (latestOpenedNoteVO == null || !latestOpenedNoteVO.isSelected()) {
            noteId = null;
        } else {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((LatestOpenedNoteVO) next2).getIndex() > latestOpenedNoteVO.getIndex()) {
                    break;
                }
            }
            LatestOpenedNoteVO latestOpenedNoteVO2 = (LatestOpenedNoteVO) next2;
            if (latestOpenedNoteVO2 != null) {
                noteId = latestOpenedNoteVO2.getNoteId();
            } else {
                ListIterator listIterator = listO00O0O.listIterator(listO00O0O.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    if (((LatestOpenedNoteVO) objPrevious).getIndex() < latestOpenedNoteVO.getIndex()) {
                        break;
                    }
                }
                LatestOpenedNoteVO latestOpenedNoteVO3 = (LatestOpenedNoteVO) objPrevious;
                if (latestOpenedNoteVO3 != null) {
                    noteId = latestOpenedNoteVO3.getNoteId();
                } else {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                        if (((LatestOpenedNoteVO) next3).getIndex() != latestOpenedNoteVO.getIndex()) {
                            break;
                        }
                    }
                    LatestOpenedNoteVO latestOpenedNoteVO4 = (LatestOpenedNoteVO) next3;
                    if (latestOpenedNoteVO4 != null) {
                        noteId = latestOpenedNoteVO4.getNoteId();
                    }
                }
            }
        }
        this.f103716OooOo0o = noteId;
        this.f103715OooOo = 1;
        C27788OooO0o c27788OooO0o = c29250OooOoO0.f103735OooO0o0;
        c27788OooO0o.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27787OooO0Oo(c27788OooO0o, str, null), this);
        if (objOooO0o != EnumC32485OooO00o.f116726OooOo0o) {
            objOooO0o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0o == obj2 ? obj2 : noteId;
    }
}
