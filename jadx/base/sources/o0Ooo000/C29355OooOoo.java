package o0Ooo000;

import androidx.lifecycle.AbstractC22019Ooooooo;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.data.repo.transactions.C22961Ooooo00;
import com.orion.notein.data.repo.transactions.o000oOoO;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.NoteTreeInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import o00o00O0.C25252OooO0Oo;
import o0OO00o0.o000Oo0;
import o0OO0o0.C26845OoooO0O;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27600o0ooOO0;
import o0OOo0o.o0Oo0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o0Ooo000.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lo0Ooo000/OooOoo;", "Landroidx/lifecycle/Ooooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C29355OooOoo extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final NoteTreeInfo f104107OooOO0 = new NoteTreeInfo("note_id_root_item", "", EnumC29357OooOooO.f104116OooOo0o, 0, false, 0, null, null, false, 472, null);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o000Oo0 f104108OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27600o0ooOO0 f104109OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C33781o00o0O f104110OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC33721OooO0o<String> f104111OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C33781o00o0O f104112OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33781o00o0O f104113OooO0oo;

    public C29355OooOoo(C27129OoooOOO c27129OoooOOO, C27600o0ooOO0 c27600o0ooOO0, C27449o00O0OoO c27449o00O0OoO) {
        this.f104109OooO0Oo = c27600o0ooOO0;
        InterfaceC33721OooO0o<String> interfaceC33721OooO0oOooO0OO = c27129OoooOOO.OooO0OO();
        this.f104111OooO0o0 = interfaceC33721OooO0oOooO0OO;
        o000oOoO o000oooo2 = new o000oOoO(C25252OooO0Oo.OooOoO(interfaceC33721OooO0oOooO0OO, new C29351OooOo0o(null, c27449o00O0OoO)), this, 1);
        C26845OoooO0O c26845OoooO0O = new C26845OoooO0O(o000oooo2, 1);
        C22961Ooooo00 c22961Ooooo00 = new C22961Ooooo00(c27600o0ooOO0.OooO0o0(), this, 1);
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(C34438OooOoo0.f123458OooOo0o);
        this.f104110OooO0o = c33781o00o0OOooO00o;
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o("");
        this.f104112OooO0oO = c33781o00o0OOooO00o2;
        C33781o00o0O c33781o00o0OOooO00o3 = C33784o00ooo.OooO00o("");
        this.f104113OooO0oo = c33781o00o0OOooO00o3;
        this.f104108OooO = new o000Oo0(C25252OooO0Oo.OooO(new C33763OoooOOO(c26845OoooO0O, c22961Ooooo00, new C29348OooOo0(3, null)), c33781o00o0OOooO00o2, c33781o00o0OOooO00o, new C33763OoooOOO(o000oooo2, c33781o00o0OOooO00o3, new C29350OooOo0O(3, null)), new C29354OooOoOO(this, null)), new C29356OooOoo0(2, null), 1);
        C29343OooOOOo.OooO00o("NoteTreeSelectionViewModel.init, hash: " + hashCode() + ".");
    }

    public static NoteTreeInfo OooO0o(NoteMeta noteMeta) {
        return new NoteTreeInfo(noteMeta.getId(), noteMeta.getTitle(), noteMeta.getPdfInfo() != null ? EnumC29357OooOooO.f104115OooOo : EnumC29357OooOooO.f104118OooOoO0, 0, false, noteMeta.getCreationTime(), null, noteMeta.getParentId(), false, StyleIdentifier.LIST_TABLE_2_ACCENT_3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x023f, code lost:
    
        if (r1 == r3) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0145 A[LOOP:0: B:36:0x013f->B:38:0x0145, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018a A[LOOP:1: B:40:0x0184->B:42:0x018a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x023f -> B:57:0x0242). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0245 -> B:60:0x024e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x024a -> B:60:0x024e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(NoteTreeInfo noteTreeInfo, Set set, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C29349OooOo00 c29349OooOo00;
        NoteTreeInfo noteTreeInfo2;
        C29355OooOoo c29355OooOoo;
        Object obj;
        Set set2;
        Set set3;
        NoteTreeInfo noteTreeInfo3;
        List list;
        Iterator it;
        List listO00O0O;
        List listOooO0oO;
        Collection arrayList;
        Set set4;
        C29355OooOoo c29355OooOoo2;
        Iterator it2;
        if (abstractC32479OooO0OO instanceof C29349OooOo00) {
            c29349OooOo00 = (C29349OooOo00) abstractC32479OooO0OO;
            int i = c29349OooOo00.f104083OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29349OooOo00.f104083OooOooO = i - Integer.MIN_VALUE;
            } else {
                c29349OooOo00 = new C29349OooOo00(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o0 = c29349OooOo00.f104082OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29349OooOo00.f104083OooOooO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o0);
            Folder folder = noteTreeInfo.getFolder();
            c29349OooOo00.f104077OooOo0o = this;
            noteTreeInfo2 = noteTreeInfo;
            c29349OooOo00.f104076OooOo = noteTreeInfo2;
            c29349OooOo00.f104079OooOoO0 = set;
            c29349OooOo00.f104083OooOooO = 1;
            C27600o0ooOO0 c27600o0ooOO0 = this.f104109OooO0Oo;
            c27600o0ooOO0.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0Oo0oo(c27600o0ooOO0, folder, null), c29349OooOo00);
            if (objOooO0o != enumC32485OooO00o) {
                c29355OooOoo = this;
                obj = objOooO0o;
                set2 = set;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            Set set5 = (Set) c29349OooOo00.f104079OooOoO0;
            NoteTreeInfo noteTreeInfo4 = (NoteTreeInfo) c29349OooOo00.f104076OooOo;
            c29355OooOoo = c29349OooOo00.f104077OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o0);
            obj = objOooO0o0;
            set2 = set5;
            noteTreeInfo2 = noteTreeInfo4;
        } else if (i2 == 2) {
            list = (List) c29349OooOo00.f104078OooOoO;
            set3 = (Set) c29349OooOo00.f104079OooOoO0;
            noteTreeInfo3 = (NoteTreeInfo) c29349OooOo00.f104076OooOo;
            c29355OooOoo = c29349OooOo00.f104077OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o0);
            C29355OooOoo c29355OooOoo3 = c29355OooOoo;
            Iterable<Folder> iterable = (Iterable) objOooO0o0;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
            for (Folder folder2 : iterable) {
                c29355OooOoo3.getClass();
                arrayList2.add(new NoteTreeInfo(folder2.getId(), folder2.getTitle(), EnumC29357OooOooO.f104117OooOoO, 0, false, folder2.getCreationTime(), folder2, folder2.getParentId(), false, StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_1, null));
            }
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
            it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(NoteTreeInfo.copy$default((NoteTreeInfo) it.next(), null, null, null, noteTreeInfo3.getLevel() + 1, false, 0L, null, null, false, 503, null));
            }
            listO00O0O = oOo000Oo.OooOo.o00O0O(oOo000Oo.OooOo.OooooOO(list, arrayList3), new C29346OooOOoo());
            if (!listO00O0O.isEmpty()) {
                return com.facebook.soloader.OooOo.OooO0oO(NoteTreeInfo.copy$default(noteTreeInfo3, null, null, null, 0, false, 0L, null, null, true, 255, null));
            }
            listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(NoteTreeInfo.copy$default(noteTreeInfo3, null, null, null, 0, true, 0L, null, null, false, 239, null));
            arrayList = new ArrayList();
            set4 = set3;
            c29355OooOoo2 = c29355OooOoo3;
            it2 = listO00O0O.iterator();
            if (it2.hasNext()) {
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            listOooO0oO = c29349OooOo00.f104080OooOoOO;
            it2 = (Iterator) c29349OooOo00.f104078OooOoO;
            arrayList = c29349OooOo00.f104079OooOoO0;
            set4 = (Set) c29349OooOo00.f104076OooOo;
            c29355OooOoo2 = c29349OooOo00.f104077OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o0);
            List listOooO0oO2 = (List) objOooO0o0;
            C34431OooOo0.OooOo0o(arrayList, listOooO0oO2);
            if (it2.hasNext()) {
                NoteTreeInfo noteTreeInfo5 = (NoteTreeInfo) it2.next();
                if (noteTreeInfo5.isFolder() && set4.contains(noteTreeInfo5.getNoteId())) {
                    c29349OooOo00.f104077OooOo0o = c29355OooOoo2;
                    c29349OooOo00.f104076OooOo = set4;
                    c29349OooOo00.f104079OooOoO0 = arrayList;
                    c29349OooOo00.f104078OooOoO = it2;
                    c29349OooOo00.f104080OooOoOO = listOooO0oO;
                    c29349OooOo00.f104083OooOooO = 3;
                    objOooO0o0 = c29355OooOoo2.OooO0o0(noteTreeInfo5, set4, c29349OooOo00);
                } else {
                    listOooO0oO2 = com.facebook.soloader.OooOo.OooO0oO(noteTreeInfo5);
                    C34431OooOo0.OooOo0o(arrayList, listOooO0oO2);
                    if (it2.hasNext()) {
                        return oOo000Oo.OooOo.OooooOO(listOooO0oO, (List) arrayList);
                    }
                }
            }
        }
        Iterable<NoteMeta> iterable2 = (Iterable) obj;
        ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
        for (NoteMeta noteMeta : iterable2) {
            c29355OooOoo.getClass();
            arrayList4.add(OooO0o(noteMeta));
        }
        ArrayList arrayList5 = new ArrayList(C34428OooOOo.OooOOoo(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(NoteTreeInfo.copy$default((NoteTreeInfo) it3.next(), null, null, null, noteTreeInfo2.getLevel() + 1, false, 0L, null, null, false, 503, null));
        }
        C27600o0ooOO0 c27600o0ooOO02 = c29355OooOoo.f104109OooO0Oo;
        String noteId = noteTreeInfo2.getNoteId();
        c29349OooOo00.f104077OooOo0o = c29355OooOoo;
        c29349OooOo00.f104076OooOo = noteTreeInfo2;
        c29349OooOo00.f104079OooOoO0 = set2;
        c29349OooOo00.f104078OooOoO = arrayList5;
        c29349OooOo00.f104083OooOooO = 2;
        Serializable serializableOooO0oO = c27600o0ooOO02.f96982OooO00o.OooO0oO(noteId, c29349OooOo00);
        if (serializableOooO0oO != enumC32485OooO00o) {
            set3 = set2;
            objOooO0o0 = serializableOooO0oO;
            noteTreeInfo3 = noteTreeInfo2;
            list = arrayList5;
            C29355OooOoo c29355OooOoo32 = c29355OooOoo;
            Iterable<Folder> iterable3 = (Iterable) objOooO0o0;
            ArrayList arrayList22 = new ArrayList(C34428OooOOo.OooOOoo(iterable3, 10));
            while (r1.hasNext()) {
            }
            ArrayList arrayList32 = new ArrayList(C34428OooOOo.OooOOoo(arrayList22, 10));
            it = arrayList22.iterator();
            while (it.hasNext()) {
            }
            listO00O0O = oOo000Oo.OooOo.o00O0O(oOo000Oo.OooOo.OooooOO(list, arrayList32), new C29346OooOOoo());
            if (!listO00O0O.isEmpty()) {
            }
        }
        return enumC32485OooO00o;
    }
}
