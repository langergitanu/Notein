package o0Ooo000;

import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.NoteTreeInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32511OooOOoo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: renamed from: o0Ooo000.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.dialog.NoteTreeSelectionViewModel$treeItems$1", m80623f = "NoteTreeSelectionFragment.kt", m80624l = {119}, m80625m = "invokeSuspend")
public final class C29354OooOoOO extends AbstractC32476OooO implements InterfaceC32511OooOOoo<List<? extends NoteTreeInfo>, String, Set<? extends String>, List<? extends NoteTreeInfo>, Continuation<? super List<? extends NoteTreeInfo>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Iterator f104099OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Collection f104100OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f104101OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f104102OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f104103OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ Collection f104104OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f104105OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ C29355OooOoo f104106OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29354OooOoOO(C29355OooOoo c29355OooOoo, Continuation<? super C29354OooOoOO> continuation) {
        super(5, continuation);
        this.f104106OooOooO = c29355OooOoo;
    }

    @Override // oO0O000o.InterfaceC32511OooOOoo
    public final Object Oooo0oO(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        C29354OooOoOO c29354OooOoOO = new C29354OooOoOO(this.f104106OooOooO, (Continuation) serializable);
        c29354OooOoOO.f104101OooOoO = (List) obj;
        c29354OooOoOO.f104103OooOoOO = (String) obj2;
        c29354OooOoOO.f104105OooOoo0 = (Set) obj3;
        c29354OooOoOO.f104104OooOoo = (List) obj4;
        return c29354OooOoOO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0110  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00c6 -> B:20:0x00c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00cc -> B:23:0x00ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00e6 -> B:23:0x00ea). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Collection collectionOooooOO;
        Iterator it;
        String str2;
        Collection collection;
        Set set;
        Collection collection2;
        C29355OooOoo c29355OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104102OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List list = (List) this.f104101OooOoO;
            str = (String) this.f104103OooOoOO;
            Set set2 = (Set) this.f104105OooOoo0;
            Collection collection3 = (List) this.f104104OooOoo;
            C29343OooOOOo.OooO00o("treeItems.combine, queryResult: " + oOo000Oo.OooOo.o000oOoO(collection3, null, null, null, new o0OOo0o.OooOOO0(1), 31) + ".");
            collectionOooooOO = collection3;
            if (collectionOooooOO.isEmpty()) {
                List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(C29355OooOoo.f104107OooOO0);
                ArrayList arrayList = new ArrayList();
                it = list.iterator();
                str2 = str;
                collection = arrayList;
                set = set2;
                collection2 = listOooO0oO;
                c29355OooOoo = this.f104106OooOooO;
                if (it.hasNext()) {
                }
            }
            Collection<NoteTreeInfo> collection4 = collectionOooooOO;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(collection4, 10));
            while (r3.hasNext()) {
            }
            return arrayList2;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        it = this.f104099OooOo;
        collection = this.f104100OooOo0o;
        collection2 = this.f104104OooOoo;
        c29355OooOoo = (C29355OooOoo) this.f104105OooOoo0;
        set = (Set) this.f104103OooOoOO;
        str2 = (String) this.f104101OooOoO;
        C32446OooOOOo.OooO0O0(obj);
        Object objOooO0o0 = obj;
        List listOooO0oO2 = (List) objOooO0o0;
        C34431OooOo0.OooOo0o(collection, listOooO0oO2);
        if (it.hasNext()) {
            NoteTreeInfo noteTreeInfo = (NoteTreeInfo) it.next();
            if (!noteTreeInfo.isFolder()) {
                listOooO0oO2 = com.facebook.soloader.OooOo.OooO0oO(noteTreeInfo);
            } else if (set.contains(noteTreeInfo.getNoteId())) {
                this.f104101OooOoO = str2;
                this.f104103OooOoOO = set;
                this.f104105OooOoo0 = c29355OooOoo;
                this.f104104OooOoo = collection2;
                this.f104100OooOo0o = collection;
                this.f104099OooOo = it;
                this.f104102OooOoO0 = 1;
                NoteTreeInfo noteTreeInfo2 = C29355OooOoo.f104107OooOO0;
                objOooO0o0 = c29355OooOoo.OooO0o0(noteTreeInfo, set, this);
                if (objOooO0o0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                List listOooO0oO22 = (List) objOooO0o0;
            } else {
                listOooO0oO22 = com.facebook.soloader.OooOo.OooO0oO(NoteTreeInfo.copy$default(noteTreeInfo, null, null, null, 0, false, 0L, null, null, false, 495, null));
            }
            C34431OooOo0.OooOo0o(collection, listOooO0oO22);
            if (it.hasNext()) {
                collectionOooooOO = oOo000Oo.OooOo.OooooOO(collection2, (List) collection);
                str = str2;
                Collection<NoteTreeInfo> collection42 = collectionOooooOO;
                ArrayList arrayList22 = new ArrayList(C34428OooOOo.OooOOoo(collection42, 10));
                for (NoteTreeInfo noteTreeInfoCopy$default : collection42) {
                    if (!noteTreeInfoCopy$default.isFolder() && kotlin.jvm.internal.OooOOO0.OooO0O0(str, noteTreeInfoCopy$default.getNoteId())) {
                        noteTreeInfoCopy$default = NoteTreeInfo.copy$default(noteTreeInfoCopy$default, null, null, null, 0, !noteTreeInfoCopy$default.isSelected(), 0L, null, null, false, 495, null);
                    }
                    arrayList22.add(noteTreeInfoCopy$default);
                }
                return arrayList22;
            }
        }
    }
}
