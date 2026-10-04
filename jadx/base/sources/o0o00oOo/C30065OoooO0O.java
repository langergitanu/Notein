package o0o00oOo;

import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27455o00O0o00;
import o0oOoOo.C31051OooOo0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o00oOo.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$getNoteSimpleInfoByNoteVO$2", m80623f = "NoteListViewModel.kt", m80624l = {1858, 1866}, m80625m = "invokeSuspend")
public final class C30065OoooO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C31051OooOo0O>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f106951OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public SimpleDateFormat f106952OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f106953OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f106954OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ NoteVO f106955OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30065OoooO0O(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, NoteVO noteVO, Continuation<? super C30065OoooO0O> continuation) {
        super(2, continuation);
        this.f106953OooOoO = oooO0OO;
        this.f106955OooOoOO = noteVO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30065OoooO0O(this.f106953OooOoO, this.f106955OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C31051OooOo0O> continuation) {
        return ((C30065OoooO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooOOo;
        SimpleDateFormat simpleDateFormat;
        Object next;
        long jLongValue;
        long lastModificationTime;
        Object objOooO0o;
        SimpleDateFormat simpleDateFormat2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f106954OooOoO0;
        com.orion.notein.p607ui.notelist.OooO0OO oooO0OO = this.f106953OooOoO;
        NoteVO noteVO = this.f106955OooOoOO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33721OooO0o<String> interfaceC33721OooO0o = oooO0OO.f77165OoooOOo;
            this.f106954OooOoO0 = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(interfaceC33721OooO0o, this);
            if (objOooOOo != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = this.f106951OooOo;
            simpleDateFormat2 = this.f106952OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            lastModificationTime = j;
            objOooO0o = obj;
            jLongValue = ((Number) objOooO0o).longValue();
            simpleDateFormat = simpleDateFormat2;
            long j2 = jLongValue;
            String name = noteVO.getName();
            boolean zIsPdf = noteVO.isPdf();
            boolean z = noteVO.getType() == 1;
            long creationTime = noteVO.getCreationTime();
            long lastModificationTime2 = noteVO.getLastModificationTime();
            String str = simpleDateFormat.format(new Long(noteVO.getCreationTime()));
            kotlin.jvm.internal.OooOOO0.OooO0o(str, "format(...)");
            String str2 = simpleDateFormat.format(new Long(noteVO.getLastModificationTime()));
            kotlin.jvm.internal.OooOOO0.OooO0o(str2, "format(...)");
            String str3 = simpleDateFormat.format(new Long(lastModificationTime));
            kotlin.jvm.internal.OooOOO0.OooO0o(str3, "format(...)");
            return new C31051OooOo0O(name, zIsPdf, z, creationTime, lastModificationTime2, j2, lastModificationTime, str, str2, str3);
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooOOo = obj;
        simpleDateFormat = new SimpleDateFormat(objOooOOo + " hh:mm", Locale.getDefault());
        Iterator it = ((Iterable) oooO0OO.f77166OoooOo0.f121747OooOo0o.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((CloudMetaLocal) next).getId(), noteVO.getId())) {
                break;
            }
        }
        CloudMetaLocal cloudMetaLocal = (CloudMetaLocal) next;
        jLongValue = 0;
        lastModificationTime = cloudMetaLocal != null ? cloudMetaLocal.getLastModificationTime() : 0L;
        if (noteVO.getType() != 1) {
            String id = noteVO.getId();
            boolean zIsPdf2 = noteVO.isPdf();
            this.f106952OooOo0o = simpleDateFormat;
            this.f106951OooOo = lastModificationTime;
            this.f106954OooOoO0 = 2;
            C27449o00O0OoO c27449o00O0OoO = oooO0OO.f77121OooO0Oo;
            c27449o00O0OoO.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27455o00O0o00(id, null, c27449o00O0OoO, zIsPdf2), this);
            if (objOooO0o != enumC32485OooO00o) {
                simpleDateFormat2 = simpleDateFormat;
                jLongValue = ((Number) objOooO0o).longValue();
                simpleDateFormat = simpleDateFormat2;
            }
            return enumC32485OooO00o;
        }
        long j22 = jLongValue;
        String name2 = noteVO.getName();
        boolean zIsPdf3 = noteVO.isPdf();
        boolean z2 = noteVO.getType() == 1;
        long creationTime2 = noteVO.getCreationTime();
        long lastModificationTime22 = noteVO.getLastModificationTime();
        String str4 = simpleDateFormat.format(new Long(noteVO.getCreationTime()));
        kotlin.jvm.internal.OooOOO0.OooO0o(str4, "format(...)");
        String str22 = simpleDateFormat.format(new Long(noteVO.getLastModificationTime()));
        kotlin.jvm.internal.OooOOO0.OooO0o(str22, "format(...)");
        String str32 = simpleDateFormat.format(new Long(lastModificationTime));
        kotlin.jvm.internal.OooOOO0.OooO0o(str32, "format(...)");
        return new C31051OooOo0O(name2, zIsPdf3, z2, creationTime2, lastModificationTime22, j22, lastModificationTime, str4, str22, str32);
    }
}
