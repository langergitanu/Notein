package o0o0O000;

import android.content.Context;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.FolderVO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27600o0ooOO0;
import o0OOo0oo.o0ooOOo;
import o0OOoooO.C27996OooO00o;
import o0OOoooO.C28000OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33779o00Oo0;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33788ooOO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lo0o0O000/OooO;", "Landroidx/lifecycle/Ooooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class OooO extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C33781o00o0O f107610OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27600o0ooOO0 f107611OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0ooOOo f107612OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27449o00O0OoO f107613OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList<String> f107614OooO0oO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33781o00o0O f107615OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C33769Ooooo0o f107616OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C33781o00o0O f107617OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C33769Ooooo0o f107618OooOO0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.FolderDialogViewModel$allFolders$1", m80623f = "FolderDialogViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32509OooOOo<List<? extends Folder>, FolderVO, Set<? extends String>, Continuation<? super List<? extends FolderVO>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ FolderVO f107619OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ List f107620OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ Context f107621OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Set f107622OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ OooO f107623OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, OooO oooO, Continuation<? super OooO00o> continuation) {
            super(4, continuation);
            this.f107621OooOoO = context;
            this.f107623OooOoOO = oooO;
        }

        @Override // oO0O000o.InterfaceC32509OooOOo
        public final Object invoke(List<? extends Folder> list, FolderVO folderVO, Set<? extends String> set, Continuation<? super List<? extends FolderVO>> continuation) {
            OooO00o oooO00o = new OooO00o(this.f107621OooOoO, this.f107623OooOoOO, continuation);
            oooO00o.f107620OooOo0o = list;
            oooO00o.f107619OooOo = folderVO;
            oooO00o.f107622OooOoO0 = set;
            return oooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            int i;
            Object next;
            int i2 = 1;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            List list = this.f107620OooOo0o;
            FolderVO folderVO = this.f107619OooOo;
            Set set = this.f107622OooOoO0;
            String string = this.f107621OooOoO.getString(R.string.desktop);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            FolderVO folderVO2 = new FolderVO("desktop", string, set.contains("desktop"), 0, kotlin.jvm.internal.OooOOO0.OooO0O0(folderVO.getId(), "desktop"), true, true, C27996OooO00o.f99274OooO00o);
            OooO oooO = this.f107623OooOoOO;
            oooO.getClass();
            List list2 = list;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (((Folder) obj2).getParentId() == null) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C34431OooOo0.OooOo0o(arrayList2, OooO.OooO0o0((Folder) it.next(), list));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : arrayList2) {
                Folder folder = (Folder) obj3;
                if (folder.getParentId() == null ? set.contains("desktop") : oOo000Oo.OooOo.Oooo00o(set, folder.getParentId())) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Folder folder2 = (Folder) it2.next();
                String id = folder2.getId();
                String title = folder2.getTitle();
                boolean zContains = set.contains(folder2.getId());
                boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(folderVO.getId(), folder2.getId());
                String parentId = folder2.getParentId();
                int i3 = i2;
                while (parentId != null) {
                    i3 += i2;
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            i = i2;
                            next = null;
                            break;
                        }
                        next = it3.next();
                        i = i2;
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((Folder) next).getId(), parentId)) {
                            break;
                        }
                        i2 = i;
                    }
                    Folder folder3 = (Folder) next;
                    parentId = folder3 != null ? folder3.getParentId() : null;
                    i2 = i;
                }
                int i4 = i2;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : list2) {
                    Iterator it4 = it2;
                    FolderVO folderVO3 = folderVO;
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((Folder) obj4).getParentId(), folder2.getId())) {
                        arrayList5.add(obj4);
                    }
                    it2 = it4;
                    folderVO = folderVO3;
                }
                Iterator it5 = it2;
                FolderVO folderVO4 = folderVO;
                boolean z = !arrayList5.isEmpty();
                boolean z2 = !oooO.f107614OooO0oO.contains(folder2.getId());
                Integer coverColor = folder2.getCoverColor();
                arrayList4.add(new FolderVO(id, title, zContains, i3, zOooO0O0, z, z2, coverColor != null ? coverColor.intValue() : C27996OooO00o.f99274OooO00o));
                it2 = it5;
                folderVO = folderVO4;
                i2 = i4;
            }
            return oOo000Oo.OooOo.OooooOO(com.facebook.soloader.OooOo.OooO0oO(folderVO2), arrayList4);
        }
    }

    public OooO(C27600o0ooOO0 c27600o0ooOO0, C27449o00O0OoO c27449o00O0OoO, o0ooOOo o0ooooo2, Context context) {
        this.f107611OooO0Oo = c27600o0ooOO0;
        this.f107613OooO0o0 = c27449o00O0OoO;
        this.f107612OooO0o = o0ooooo2;
        String string = context.getString(R.string.desktop);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(new FolderVO("desktop", string, true, 0, true, true, true, C27996OooO00o.f99274OooO00o));
        this.f107615OooO0oo = c33781o00o0OOooO00o;
        this.f107610OooO = c33781o00o0OOooO00o;
        C28000OooO0o c28000OooO0oOooO0o0 = c27600o0ooOO0.OooO0o0();
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33779o00Oo0 c33779o00Oo0OooO00o = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        C33769Ooooo0o c33769Ooooo0oOooOoO0 = C25252OooO0Oo.OooOoO0(c28000OooO0oOooO0o0, interfaceC33636Oooo00oOooO00o, c33779o00Oo0OooO00o, c34434OooOoO);
        this.f107616OooOO0 = c33769Ooooo0oOooOoO0;
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o(C34449Oooo0oo.OooOO0("desktop"));
        this.f107617OooOO0O = c33781o00o0OOooO00o2;
        this.f107618OooOO0o = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooO0oo(c33769Ooooo0oOooOoO0, c33781o00o0OOooO00o, c33781o00o0OOooO00o2, new OooO00o(context, this, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
    }

    public static List OooO0o0(Folder folder, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((Folder) obj).getParentId(), folder.getId())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return com.facebook.soloader.OooOo.OooO0oO(folder);
        }
        List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(folder);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C34431OooOo0.OooOo0o(arrayList2, OooO0o0((Folder) it.next(), list));
        }
        return oOo000Oo.OooOo.OooooOO(listOooO0oO, arrayList2);
    }

    public final void OooO0o(FolderVO folderVO) {
        boolean zIsExpand = folderVO.isExpand();
        C33781o00o0O c33781o00o0O = this.f107617OooOO0O;
        if (!zIsExpand) {
            HashSet hashSet = new HashSet((Collection) c33781o00o0O.getValue());
            hashSet.add(folderVO.getId());
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, hashSet);
            return;
        }
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(folderVO.getId(), "desktop")) {
            C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, c34438OooOoo0);
            return;
        }
        List<Folder> list = (List) this.f107616OooOO0.f121747OooOo0o.getValue();
        for (Folder folder : list) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(folder.getId(), folderVO.getId())) {
                List listOooO0o0 = OooO0o0(folder, list);
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooO0o0, 10));
                Iterator it = listOooO0o0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Folder) it.next()).getId());
                }
                Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList);
                HashSet hashSet2 = new HashSet((Collection) c33781o00o0O.getValue());
                hashSet2.removeAll(setO0OO00O);
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, hashSet2);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
