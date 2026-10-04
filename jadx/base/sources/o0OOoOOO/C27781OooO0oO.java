package o0OOoOOO;

import Oooo0oO.o0Oo0oo;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOoOOO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.folder.RecoverDetachedFoldersUseCase$recoverNotesInFolders$2", m80623f = "RecoverDetachedFoldersUseCase.kt", m80624l = {132, 148}, m80625m = "invokeSuspend")
public final class C27781OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C27782OooO0oo f98135OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public List f98136OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Iterator f98137OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f98138OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f98139OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C27782OooO0oo f98140OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f98141OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f98142OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27781OooO0oO(ArrayList arrayList, C27782OooO0oo c27782OooO0oo, String str, Continuation continuation) {
        super(2, continuation);
        this.f98141OooOoo0 = arrayList;
        this.f98140OooOoo = c27782OooO0oo;
        this.f98142OooOooO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27781OooO0oO(this.f98141OooOoo0, this.f98140OooOoo, this.f98142OooOooO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27781OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0067 -> B:16:0x006b). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List arrayList;
        Iterator it;
        String str;
        C27782OooO0oo c27782OooO0oo;
        List list;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98139OooOoOO;
        C27782OooO0oo c27782OooO0oo2 = this.f98140OooOoo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            arrayList = new ArrayList();
            it = this.f98141OooOoo0.iterator();
            str = this.f98142OooOooO;
            c27782OooO0oo = c27782OooO0oo2;
            if (it.hasNext()) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = this.f98136OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("RecoverDetachedFoldersUseCase");
            c20358OooO00o.OooO0o0(o0Oo0oo.OooO0O0(list.size(), "Recovered ", " notes"), new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        Iterator it2 = this.f98137OooOoO;
        String str2 = this.f98138OooOoO0;
        C27782OooO0oo c27782OooO0oo3 = this.f98135OooOo;
        List list2 = this.f98136OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        it = it2;
        arrayList = list2;
        c27782OooO0oo = c27782OooO0oo3;
        str = str2;
        Object objOooOOoo = obj;
        ArrayList<NoteMeta> arrayList2 = new ArrayList();
        for (Object obj2 : (List) objOooOOoo) {
            if (((NoteMeta) obj2).getInTrashBin()) {
                arrayList2.add(obj2);
            }
        }
        for (NoteMeta noteMeta : arrayList2) {
            String recoverParentId = noteMeta.getRecoverParentId();
            if (recoverParentId == null) {
                recoverParentId = noteMeta.getParentId();
            }
            arrayList.add(NoteMeta.copy$default(noteMeta, null, null, null, recoverParentId, null, false, null, 0, 0, false, null, 0, 0L, 0L, null, false, false, false, 0L, 523751, null));
        }
        if (it.hasNext()) {
            List list3 = arrayList;
            if (!list3.isEmpty()) {
                NoteMeta[] noteMetaArr = (NoteMeta[]) list3.toArray(new NoteMeta[0]);
                NoteMeta[] noteMetaArr2 = (NoteMeta[]) Arrays.copyOf(noteMetaArr, noteMetaArr.length);
                this.f98136OooOo0o = arrayList;
                this.f98135OooOo = null;
                this.f98138OooOoO0 = null;
                this.f98137OooOoO = null;
                this.f98139OooOoOO = 2;
                if (c27782OooO0oo2.f98144OooO0O0.OooOo0O(noteMetaArr2, this) != enumC32485OooO00o) {
                    list = arrayList;
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("RecoverDetachedFoldersUseCase");
                    c20358OooO00o2.OooO0o0(o0Oo0oo.OooO0O0(list.size(), "Recovered ", " notes"), new Object[0]);
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        String str3 = (String) it.next();
        InterfaceC27313OooOoo0 interfaceC27313OooOoo0 = c27782OooO0oo.f98144OooO0O0;
        this.f98136OooOo0o = arrayList;
        this.f98135OooOo = c27782OooO0oo;
        this.f98138OooOoO0 = str;
        this.f98137OooOoO = it;
        this.f98139OooOoOO = 1;
        objOooOOoo = interfaceC27313OooOoo0.OooOOoo(str3, str, this);
        return enumC32485OooO00o;
    }
}
