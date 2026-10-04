package com.orion.notein.p607ui.notelist;

import OooO0Oo.C20398OooO0O0;
import OooOoo.C20593OooO0Oo;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import Oooo.C20813OooO0o0;
import Oooo0.o000000O;
import Oooo0oO.C21023OooO0Oo;
import OoooooO.C21445Oooo;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.OooOOO;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.aspose.slides.C22201OooO0oO;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.nimbusds.jose.shaded.json.parser.JSONParser;
import com.orion.notein.App;
import com.orion.notein.domain.models.Label;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.domain.models.file.ImportFileResult;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.note.NotePlaceHolder;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24334OooO0O0;
import o000OO00.C24472OooOoo;
import o00o00O0.C25252OooO0Oo;
import o0OO00o0.C26577o000oo0O;
import o0OO00o0.o000Oo0;
import o0OO0o00.C26894Oooo0o;
import o0OO0o00.o00O0O;
import o0OOOO0o.C27129OoooOOO;
import o0OOOoo.C27205OooO0OO;
import o0OOo0Oo.InterfaceC27296OooOO0o;
import o0OOo0Oo.InterfaceC27306OooOo00;
import o0OOo0Oo.InterfaceC27307OooOo0O;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0o.C27351Oooo0O0;
import o0OOo0o.C27376o000000o;
import o0OOo0o.C27387o0000o0;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27496o00OoOoO;
import o0OOo0o.C27499o00Ooo0;
import o0OOo0o.C27538o00o0o0O;
import o0OOo0o.C27570o00oOoo0;
import o0OOo0o.C27585o00ooO0;
import o0OOo0o.C27597o00ooo00;
import o0OOo0o.C27600o0ooOO0;
import o0OOo0o.o00000O;
import o0OOo0o.o000OO;
import o0OOo0o.o0O0O00;
import o0OOo0o0.InterfaceC27605OooO00o;
import o0OOo0oo.C27621OooOO0O;
import o0OOo0oo.o0000OOO;
import o0OOo0oo.o0ooOOo;
import o0OOoOo0.C27819OooOoo;
import o0OOoooO.C27996OooO00o;
import o0Oo00oO.C28035OooO00o;
import o0Oo0O00.C28051OooO00o;
import o0Oo0O0O.C28056OooO0Oo;
import o0Oo0O0O.C28057OooO0o;
import o0Oo0O0O.C28058OooO0o0;
import o0Oo0O0O.C28059OooO0oO;
import o0OoooOo.C29649OooOOOo;
import o0OoooOo.C29651OooOOo0;
import o0o000oo.C29857Oooooo;
import o0o00oOo.C30053Oooo;
import o0o00oOo.C30054Oooo00O;
import o0o00oOo.C30055Oooo00o;
import o0o00oOo.C30056Oooo0O0;
import o0o00oOo.C30060Oooo0oO;
import o0o00oOo.C30061Oooo0oo;
import o0o00oOo.C30064OoooO00;
import o0o00oOo.C30066OoooOO0;
import o0o00oOo.C30067OoooOOO;
import o0o00oOo.C30068OoooOOo;
import o0o00oOo.C30069OoooOo0;
import o0o00oOo.C30070OoooOoO;
import o0o00oOo.C30072Ooooo00;
import o0o00oOo.C30073Ooooo0o;
import o0o00oOo.C30074OooooO0;
import o0o00oOo.C30075OooooOO;
import o0o00oOo.C30076OooooOo;
import o0o00oOo.C30078Oooooo0;
import o0o00oOo.C30079OoooooO;
import o0o00oOo.C30080Ooooooo;
import o0o00oOo.C30081o000000o;
import o0o00oOo.C30087o00o0O;
import o0o00oOo.C30088o00oO0o;
import o0o00oOo.C30089o00ooo;
import o0o00oOo.C30090o0ooOO0;
import o0o00oOo.C30091o0ooOoO;
import o0o00oOo.C30092ooOO;
import o0o00oOo.Oooo0;
import o0o00oOo.Oooo000;
import o0o00oOo.o000000;
import o0o00oOo.o00000O0;
import o0o00oOo.o000oOoO;
import o0o00oOo.o00Oo0;
import o0o00oOo.o00Ooo;
import o0o00oOo.o00oO0O;
import o0o00oOo.o0OOO0o;
import o0o00oOo.o0Oo0oo;
import o0o00oOo.oo000o;
import o0oOoOo.C31040OooOO0o;
import o0oOoOo.C31049OooOo0;
import oO00ooO.C32443OooOOO;
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
import oO0o0OO.InterfaceC33642Oooo0oo;
import oO0o0OO.o00000OO;
import oO0o0Oo.C33718OooO0O0;
import oO0o0Oo.C33758OoooO;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oO0o0Oo.C33777o000oOoO;
import oO0o0Oo.C33779o00Oo0;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33767OoooOoo;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0OoO.C33799OooOO0O;
import oO0o0Ooo.C33822OooO0OO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.OooOo;
import oOoo0.InterfaceC34591OooO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/OooO0OO;", "Landroidx/lifecycle/Ooooooo;", "OooO0o", "OooO0OO", "OooO0Oo", "OooO0o0", "OooO0O0", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class OooO0OO extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public static final C31049OooOo0 f77116Oooooo = new C31049OooOo0(0, true);

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public static final C31049OooOo0 f77117OoooooO = new C31049OooOo0(1, false);

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public static final C31049OooOo0 f77118Ooooooo = new C31049OooOo0(2, false);

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public static final C31049OooOo0 f77119o0OoOo0 = new C31049OooOo0(3, false);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C27597o00ooo00 f77120OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27449o00O0OoO f77121OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C27570o00oOoo0 f77122OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000OO f77123OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C27600o0ooOO0 f77124OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C27351Oooo0O0 f77125OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f77126OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final InterfaceC27296OooOO0o f77127OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f77128OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C27538o00o0o0O f77129OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C27499o00Ooo0 f77130OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final InterfaceC27307OooOo0O f77131OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final InterfaceC27306OooOo00 f77132OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final o0000OOO f77133OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final C27819OooOoo f77134OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final C27387o0000o0 f77135OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33781o00o0O f77136OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final Context f77137OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final o0ooOOo f77138OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final C33781o00o0O f77139OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C33781o00o0O f77140OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C33781o00o0O f77141OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C33781o00o0O f77142OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final LinkedHashMap f77143OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C33772OooooOo f77144OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C33772OooooOo f77145OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C33781o00o0O f77146OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C33781o00o0O f77147OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final C33781o00o0O f77148Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final C33781o00o0O f77149Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final InterfaceC33721OooO0o<String> f77150Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C33781o00o0O f77151Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C33781o00o0O f77152Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final C33769Ooooo0o f77153Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final C33769Ooooo0o f77154Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final C33781o00o0O f77155Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final C33781o00o0O f77156Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final C33781o00o0O f77157Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final C33781o00o0O f77158Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final C33769Ooooo0o f77159OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final C33769Ooooo0o f77160OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final C33781o00o0O f77161OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final InterfaceC33721OooO0o<Map<String, Integer>> f77162OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final C33781o00o0O f77163OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final C33769Ooooo0o f77164OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final InterfaceC33721OooO0o<String> f77165OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final C33769Ooooo0o f77166OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final C33769Ooooo0o f77167OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final C33772OooooOo f77168OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final o000Oo0 f77169Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final C33769Ooooo0o f77170Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final C33769Ooooo0o f77171OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final C33769Ooooo0o f77172OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public o00000OO f77173OooooOo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public final ConcurrentHashMap<String, InterfaceC33642Oooo0oo<C32460OooOooO>> f77174Oooooo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final C33781o00o0O f77175o000oOoO;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$setCurrentFolder$4", m80623f = "NoteListViewModel.kt", m80624l = {902, 913}, m80625m = "invokeSuspend")
    public static final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f77176OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public NoteVO f77177OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f77178OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ NoteVO f77179OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(OooO0OO oooO0OO, NoteVO noteVO, Continuation continuation) {
            super(2, continuation);
            this.f77179OooOoO0 = noteVO;
            this.f77178OooOoO = oooO0OO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO(this.f77178OooOoO, this.f77179OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        
            if (r2 == r1) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x016b  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0174  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String name;
            Object objOooO0Oo;
            String parentId;
            Object objOooO0Oo2;
            NoteVO noteVO;
            NoteVO noteVO2;
            String str;
            String name2;
            String name3;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77176OooOo;
            OooO0OO oooO0OO = this.f77178OooOoO;
            NoteVO noteVO3 = this.f77179OooOoO0;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteListViewModel");
                if (noteVO3 == null || (name = noteVO3.getName()) == null) {
                    name = CloudMetaExtra.DEFINE_NON_PARENT_ID;
                }
                c20358OooO00o.OooO00o("setCurrentFolder: ".concat(name), new Object[0]);
                if (noteVO3 == null) {
                    if (noteVO3 != null && (parentId = noteVO3.getParentId()) != null) {
                        C27600o0ooOO0 c27600o0ooOO0 = oooO0OO.f77124OooO0oO;
                        this.f77177OooOo0o = noteVO3;
                        this.f77176OooOo = 2;
                        objOooO0Oo2 = c27600o0ooOO0.OooO0Oo(parentId, this);
                        if (objOooO0Oo2 != enumC32485OooO00o) {
                            noteVO = noteVO3;
                            Folder folder = (Folder) objOooO0Oo2;
                            if (folder == null) {
                            }
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("NoteListViewModel");
                            c20358OooO00o2.OooO0o0("NoteListVm._curFolder.value, folder: " + noteVO3 + ".", new Object[0]);
                            c20358OooO00o2.OooOOO0("NoteListViewModel");
                            c20358OooO00o2.OooO0o0("NoteListVm._curFolder.value, parent: " + noteVO2 + ".", new Object[0]);
                            c20358OooO00o2.OooOOO0("NoteListViewModel");
                            str = "Desktop";
                            if (noteVO3 != null) {
                                name2 = "Desktop";
                            }
                            if (noteVO2 != null) {
                                str = name3;
                            }
                            c20358OooO00o2.OooO00o(C22237OooO0o0.OooO00o("setCurrentFolder: final ", name2, ", parent: ", str), new Object[0]);
                            C33781o00o0O c33781o00o0O = oooO0OO.f77148Oooo;
                            C32443OooOOO c32443OooOOO = new C32443OooOOO(noteVO3, noteVO2);
                            c33781o00o0O.getClass();
                            c33781o00o0O.OooOO0(null, c32443OooOOO);
                            return C32460OooOooO.f116667OooO00o;
                        }
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o22.OooOOO0("NoteListViewModel");
                    c20358OooO00o22.OooO0o0("NoteListVm._curFolder.value, folder: " + noteVO3 + ".", new Object[0]);
                    c20358OooO00o22.OooOOO0("NoteListViewModel");
                    c20358OooO00o22.OooO0o0("NoteListVm._curFolder.value, parent: " + noteVO2 + ".", new Object[0]);
                    c20358OooO00o22.OooOOO0("NoteListViewModel");
                    str = "Desktop";
                    if (noteVO3 != null) {
                    }
                    if (noteVO2 != null) {
                    }
                    c20358OooO00o22.OooO00o(C22237OooO0o0.OooO00o("setCurrentFolder: final ", name2, ", parent: ", str), new Object[0]);
                    C33781o00o0O c33781o00o0O2 = oooO0OO.f77148Oooo;
                    C32443OooOOO c32443OooOOO2 = new C32443OooOOO(noteVO3, noteVO2);
                    c33781o00o0O2.getClass();
                    c33781o00o0O2.OooOO0(null, c32443OooOOO2);
                    return C32460OooOooO.f116667OooO00o;
                }
                C27600o0ooOO0 c27600o0ooOO02 = oooO0OO.f77124OooO0oO;
                String id = noteVO3.getId();
                this.f77176OooOo = 1;
                objOooO0Oo = c27600o0ooOO02.OooO0Oo(id, this);
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                noteVO = this.f77177OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0Oo2 = obj;
                Folder folder2 = (Folder) objOooO0Oo2;
                noteVO2 = folder2 == null ? new NoteVO(folder2.getId(), null, noteVO.getUid(), folder2.getTitle(), folder2.getParentId(), folder2.getTnPath(), o000000O.OooO0o(93), o000000O.OooO0o(130), PaperOrientation.VERTICAL, false, folder2.getCreationTime(), folder2.getLastModificationTime(), false, false, folder2.getFavorite(), 0, 1, null, null, null, null, null, null, 0, null, false, false, 0L, false, null, false, 2147352578, null) : null;
                C34406OooO00o.C20358OooO00o c20358OooO00o222 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o222.OooOOO0("NoteListViewModel");
                c20358OooO00o222.OooO0o0("NoteListVm._curFolder.value, folder: " + noteVO3 + ".", new Object[0]);
                c20358OooO00o222.OooOOO0("NoteListViewModel");
                c20358OooO00o222.OooO0o0("NoteListVm._curFolder.value, parent: " + noteVO2 + ".", new Object[0]);
                c20358OooO00o222.OooOOO0("NoteListViewModel");
                str = "Desktop";
                if (noteVO3 != null || (name2 = noteVO3.getName()) == null) {
                    name2 = "Desktop";
                }
                if (noteVO2 != null && (name3 = noteVO2.getName()) != null) {
                    str = name3;
                }
                c20358OooO00o222.OooO00o(C22237OooO0o0.OooO00o("setCurrentFolder: final ", name2, ", parent: ", str), new Object[0]);
                C33781o00o0O c33781o00o0O22 = oooO0OO.f77148Oooo;
                C32443OooOOO c32443OooOOO22 = new C32443OooOOO(noteVO3, noteVO2);
                c33781o00o0O22.getClass();
                c33781o00o0O22.OooOO0(null, c32443OooOOO22);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO0Oo = obj;
            Folder folder3 = (Folder) objOooO0Oo;
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("NoteListViewModel");
            c20358OooO00o3.OooO0o0("NoteListVm.setCurrentFolder, folder: " + noteVO3 + ".", new Object[0]);
            c20358OooO00o3.OooOOO0("NoteListViewModel");
            c20358OooO00o3.OooO0o0("NoteListVm.setCurrentFolder, currentFolder: " + folder3 + ".", new Object[0]);
            if (folder3 == null || folder3.getInTrashBin()) {
                c20358OooO00o3.OooOOO0("NoteListViewModel");
                c20358OooO00o3.OooO00o("setCurrentFolder: folder not found or in trash", new Object[0]);
                C33781o00o0O c33781o00o0O3 = oooO0OO.f77148Oooo;
                C32443OooOOO c32443OooOOO3 = new C32443OooOOO(null, null);
                c33781o00o0O3.getClass();
                c33781o00o0O3.OooOO0(null, c32443OooOOO3);
                return C32460OooOooO.f116667OooO00o;
            }
            if (noteVO3 != null) {
                C27600o0ooOO0 c27600o0ooOO03 = oooO0OO.f77124OooO0oO;
                this.f77177OooOo0o = noteVO3;
                this.f77176OooOo = 2;
                objOooO0Oo2 = c27600o0ooOO03.OooO0Oo(parentId, this);
                if (objOooO0Oo2 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o2222 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2222.OooOOO0("NoteListViewModel");
            c20358OooO00o2222.OooO0o0("NoteListVm._curFolder.value, folder: " + noteVO3 + ".", new Object[0]);
            c20358OooO00o2222.OooOOO0("NoteListViewModel");
            c20358OooO00o2222.OooO0o0("NoteListVm._curFolder.value, parent: " + noteVO2 + ".", new Object[0]);
            c20358OooO00o2222.OooOOO0("NoteListViewModel");
            str = "Desktop";
            if (noteVO3 != null) {
            }
            if (noteVO2 != null) {
            }
            c20358OooO00o2222.OooO00o(C22237OooO0o0.OooO00o("setCurrentFolder: final ", name2, ", parent: ", str), new Object[0]);
            C33781o00o0O c33781o00o0O222 = oooO0OO.f77148Oooo;
            C32443OooOOO c32443OooOOO222 = new C32443OooOOO(noteVO3, noteVO2);
            c33781o00o0O222.getClass();
            c33781o00o0O222.OooOO0(null, c32443OooOOO222);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f77180OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f77181OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Map<String, Integer> f77182OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final SimpleDateFormat f77183OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Set<String> f77184OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f77185OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final Set<String> f77186OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f77187OooO0oo;

        public OooO00o(String uid, String topFolder, Map<String, Integer> importPlaceHolderProgress, SimpleDateFormat simpleDateFormat, boolean z, Set<String> selectedNotes, Set<String> selectedFolders, boolean z2) {
            OooOOO0.OooO0oO(uid, "uid");
            OooOOO0.OooO0oO(topFolder, "topFolder");
            OooOOO0.OooO0oO(importPlaceHolderProgress, "importPlaceHolderProgress");
            OooOOO0.OooO0oO(selectedNotes, "selectedNotes");
            OooOOO0.OooO0oO(selectedFolders, "selectedFolders");
            this.f77180OooO00o = uid;
            this.f77181OooO0O0 = topFolder;
            this.f77182OooO0OO = importPlaceHolderProgress;
            this.f77183OooO0Oo = simpleDateFormat;
            this.f77185OooO0o0 = z;
            this.f77184OooO0o = selectedNotes;
            this.f77186OooO0oO = selectedFolders;
            this.f77187OooO0oo = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return OooOOO0.OooO0O0(this.f77180OooO00o, oooO00o.f77180OooO00o) && OooOOO0.OooO0O0(this.f77181OooO0O0, oooO00o.f77181OooO0O0) && OooOOO0.OooO0O0(this.f77182OooO0OO, oooO00o.f77182OooO0OO) && OooOOO0.OooO0O0(this.f77183OooO0Oo, oooO00o.f77183OooO0Oo) && this.f77185OooO0o0 == oooO00o.f77185OooO0o0 && OooOOO0.OooO0O0(this.f77184OooO0o, oooO00o.f77184OooO0o) && OooOOO0.OooO0O0(this.f77186OooO0oO, oooO00o.f77186OooO0oO) && this.f77187OooO0oo == oooO00o.f77187OooO0oo;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f77187OooO0oo) + ((this.f77186OooO0oO.hashCode() + ((this.f77184OooO0o.hashCode() + o00000.OooO0O0((this.f77183OooO0Oo.hashCode() + ((this.f77182OooO0OO.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f77180OooO00o.hashCode() * 31, 31, this.f77181OooO0O0)) * 31)) * 31, 31, this.f77185OooO0o0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NoteListCombineContext(uid=");
            sb.append(this.f77180OooO00o);
            sb.append(", topFolder=");
            sb.append(this.f77181OooO0O0);
            sb.append(", importPlaceHolderProgress=");
            sb.append(this.f77182OooO0OO);
            sb.append(", simpleDateFormat=");
            sb.append(this.f77183OooO0Oo);
            sb.append(", inSelectMode=");
            sb.append(this.f77185OooO0o0);
            sb.append(", selectedNotes=");
            sb.append(this.f77184OooO0o);
            sb.append(", selectedFolders=");
            sb.append(this.f77186OooO0oO);
            sb.append(", reachedLimitToLockNote=");
            return OooOOO.OooO00o(sb, ")", this.f77187OooO0oo);
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C19405OooO0OO f77188OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C23632OooO0o0 f77189OooO0O0;

        public OooO0O0(C19405OooO0OO coreData, C23632OooO0o0 stateConfig) {
            OooOOO0.OooO0oO(coreData, "coreData");
            OooOOO0.OooO0oO(stateConfig, "stateConfig");
            this.f77188OooO00o = coreData;
            this.f77189OooO0O0 = stateConfig;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return OooOOO0.OooO0O0(this.f77188OooO00o, oooO0O0.f77188OooO00o) && OooOOO0.OooO0O0(this.f77189OooO0O0, oooO0O0.f77189OooO0O0);
        }

        public final int hashCode() {
            return this.f77189OooO0O0.hashCode() + (this.f77188OooO00o.hashCode() * 31);
        }

        public final String toString() {
            return "NoteListCombineParams(coreData=" + this.f77188OooO00o + ", stateConfig=" + this.f77189OooO0O0 + ")";
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C19405OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<NoteMeta> f77190OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<Folder> f77191OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final List<Page> f77192OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final List<NotePlaceHolder> f77193OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Map<String, Integer> f77194OooO0o0;

        public C19405OooO0OO(List<NoteMeta> metas, List<Folder> folders, List<Page> pages, List<NotePlaceHolder> placeholders, Map<String, Integer> importPlaceHolderProgress) {
            OooOOO0.OooO0oO(metas, "metas");
            OooOOO0.OooO0oO(folders, "folders");
            OooOOO0.OooO0oO(pages, "pages");
            OooOOO0.OooO0oO(placeholders, "placeholders");
            OooOOO0.OooO0oO(importPlaceHolderProgress, "importPlaceHolderProgress");
            this.f77190OooO00o = metas;
            this.f77191OooO0O0 = folders;
            this.f77192OooO0OO = pages;
            this.f77193OooO0Oo = placeholders;
            this.f77194OooO0o0 = importPlaceHolderProgress;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19405OooO0OO)) {
                return false;
            }
            C19405OooO0OO c19405OooO0OO = (C19405OooO0OO) obj;
            return OooOOO0.OooO0O0(this.f77190OooO00o, c19405OooO0OO.f77190OooO00o) && OooOOO0.OooO0O0(this.f77191OooO0O0, c19405OooO0OO.f77191OooO0O0) && OooOOO0.OooO0O0(this.f77192OooO0OO, c19405OooO0OO.f77192OooO0OO) && OooOOO0.OooO0O0(this.f77193OooO0Oo, c19405OooO0OO.f77193OooO0Oo) && OooOOO0.OooO0O0(this.f77194OooO0o0, c19405OooO0OO.f77194OooO0o0);
        }

        public final int hashCode() {
            return this.f77194OooO0o0.hashCode() + C21445Oooo.OooO00o(this.f77193OooO0Oo, C21445Oooo.OooO00o(this.f77192OooO0OO, C21445Oooo.OooO00o(this.f77191OooO0O0, this.f77190OooO00o.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            return "NoteListCoreData(metas=" + this.f77190OooO00o + ", folders=" + this.f77191OooO0O0 + ", pages=" + this.f77192OooO0OO + ", placeholders=" + this.f77193OooO0Oo + ", importPlaceHolderProgress=" + this.f77194OooO0o0 + ")";
        }
    }

    public static final class OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Map<String, List<Label>> f77195OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Map<String, List<Label>> f77196OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Map<C32443OooOOO<String, String>, List<Label>> f77197OooO0OO;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO0Oo(Map<String, ? extends List<Label>> noteLabels, Map<String, ? extends List<Label>> folderLabels, Map<C32443OooOOO<String, String>, ? extends List<Label>> pageLabels) {
            OooOOO0.OooO0oO(noteLabels, "noteLabels");
            OooOOO0.OooO0oO(folderLabels, "folderLabels");
            OooOOO0.OooO0oO(pageLabels, "pageLabels");
            this.f77195OooO00o = noteLabels;
            this.f77196OooO0O0 = folderLabels;
            this.f77197OooO0OO = pageLabels;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0Oo)) {
                return false;
            }
            OooO0Oo oooO0Oo = (OooO0Oo) obj;
            return OooOOO0.OooO0O0(this.f77195OooO00o, oooO0Oo.f77195OooO00o) && OooOOO0.OooO0O0(this.f77196OooO0O0, oooO0Oo.f77196OooO0O0) && OooOOO0.OooO0O0(this.f77197OooO0OO, oooO0Oo.f77197OooO0OO);
        }

        public final int hashCode() {
            return this.f77197OooO0OO.hashCode() + ((this.f77196OooO0O0.hashCode() + (this.f77195OooO00o.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "NoteListLabels(noteLabels=" + this.f77195OooO00o + ", folderLabels=" + this.f77196OooO0O0 + ", pageLabels=" + this.f77197OooO0OO + ")";
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f77198OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f77199OooO0O0;

        public OooO0o(int i, int i2) {
            this.f77198OooO00o = i;
            this.f77199OooO0O0 = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0o)) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return this.f77198OooO00o == oooO0o.f77198OooO00o && this.f77199OooO0O0 == oooO0o.f77199OooO0O0;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f77199OooO0O0) + (Integer.hashCode(this.f77198OooO00o) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ScrollPosition(position=");
            sb.append(this.f77198OooO00o);
            sb.append(", offset=");
            return C21023OooO0Oo.OooO0OO(")", this.f77199OooO0O0, sb);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.OooO0OO$OooO0o0, reason: case insensitive filesystem */
    public static final class C23632OooO0o0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final boolean f77200OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.orion.notein.p607ui.p609vo.OooO00o f77201OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f77202OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Set<String> f77203OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Set<String> f77204OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final String f77205OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final String f77206OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final String f77207OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f77208OooO0oo;

        public C23632OooO0o0(com.orion.notein.p607ui.p609vo.OooO00o sortKey, int i, Set<String> selectedNotes, Set<String> selectedFolders, String uid, String topFolder, String dateFormat, boolean z, boolean z2) {
            OooOOO0.OooO0oO(sortKey, "sortKey");
            OooOOO0.OooO0oO(selectedNotes, "selectedNotes");
            OooOOO0.OooO0oO(selectedFolders, "selectedFolders");
            OooOOO0.OooO0oO(uid, "uid");
            OooOOO0.OooO0oO(topFolder, "topFolder");
            OooOOO0.OooO0oO(dateFormat, "dateFormat");
            this.f77201OooO00o = sortKey;
            this.f77202OooO0O0 = i;
            this.f77203OooO0OO = selectedNotes;
            this.f77204OooO0Oo = selectedFolders;
            this.f77206OooO0o0 = uid;
            this.f77205OooO0o = topFolder;
            this.f77207OooO0oO = dateFormat;
            this.f77208OooO0oo = z;
            this.f77200OooO = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23632OooO0o0)) {
                return false;
            }
            C23632OooO0o0 c23632OooO0o0 = (C23632OooO0o0) obj;
            return this.f77201OooO00o == c23632OooO0o0.f77201OooO00o && this.f77202OooO0O0 == c23632OooO0o0.f77202OooO0O0 && OooOOO0.OooO0O0(this.f77203OooO0OO, c23632OooO0o0.f77203OooO0OO) && OooOOO0.OooO0O0(this.f77204OooO0Oo, c23632OooO0o0.f77204OooO0Oo) && OooOOO0.OooO0O0(this.f77206OooO0o0, c23632OooO0o0.f77206OooO0o0) && OooOOO0.OooO0O0(this.f77205OooO0o, c23632OooO0o0.f77205OooO0o) && OooOOO0.OooO0O0(this.f77207OooO0oO, c23632OooO0o0.f77207OooO0oO) && this.f77208OooO0oo == c23632OooO0o0.f77208OooO0oo && this.f77200OooO == c23632OooO0o0.f77200OooO;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f77200OooO) + o00000.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((this.f77204OooO0Oo.hashCode() + ((this.f77203OooO0OO.hashCode() + C20785Oooo00o.OooO00o(this.f77202OooO0O0, this.f77201OooO00o.hashCode() * 31, 31)) * 31)) * 31, 31, this.f77206OooO0o0), 31, this.f77205OooO0o), 31, this.f77207OooO0oO), 31, this.f77208OooO0oo);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NoteListStateConfig(sortKey=");
            sb.append(this.f77201OooO00o);
            sb.append(", state=");
            sb.append(this.f77202OooO0O0);
            sb.append(", selectedNotes=");
            sb.append(this.f77203OooO0OO);
            sb.append(", selectedFolders=");
            sb.append(this.f77204OooO0Oo);
            sb.append(", uid=");
            sb.append(this.f77206OooO0o0);
            sb.append(", topFolder=");
            sb.append(this.f77205OooO0o);
            sb.append(", dateFormat=");
            sb.append(this.f77207OooO0oO);
            sb.append(", reachedLimitToLockNote=");
            sb.append(this.f77208OooO0oo);
            sb.append(", isDebugViewFlat=");
            return OooOOO.OooO00o(sb, ")", this.f77200OooO);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.OooO0OO$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$importImageFiles$1", m80623f = "NoteListViewModel.kt", m80624l = {1404, 1405}, m80625m = "invokeSuspend")
    public static final class C23633OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77210OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ List<Uri> f77211OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C23633OooO0oO(List<? extends Uri> list, Continuation<? super C23633OooO0oO> continuation) {
            super(2, continuation);
            this.f77211OooOoO0 = list;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0OO.this.new C23633OooO0oO(this.f77211OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23633OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        
            if (r7.OooO00o(r6) == r0) goto L23;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77210OooOo0o;
            OooO0OO oooO0OO = OooO0OO.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteVO noteVO = (NoteVO) ((C32443OooOOO) oooO0OO.f77161OoooO00.getValue()).f116638OooOo0o;
                String id = noteVO != null ? noteVO.getId() : null;
                List<Uri> list = this.f77211OooOoO0;
                if (list.isEmpty()) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOO0O(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "NoteListViewModel", "importImageFiles called with empty uriList, currentFolder: ", id), new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                this.f77210OooOo0o = 1;
                o000OO o000oo2 = oooO0OO.f77123OooO0o0;
                if (o000oo2.OooO0O0(o000oo2.f95609OooOOo, id, list, this) != enumC32485OooO00o) {
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
            o0000OOO o0000ooo = oooO0OO.f77133OooOOo;
            this.f77210OooOo0o = 2;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.OooO0OO$OooO0oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$rename$2", m80623f = "NoteListViewModel.kt", m80624l = {945, 949, 956, JSONParser.MODE_JSON_SIMPLE}, m80625m = "invokeSuspend")
    public static final class C23634OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f77212OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Folder f77213OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f77214OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ int f77215OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ String f77216OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ String f77217OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23634OooO0oo(int i, OooO0OO oooO0OO, String str, String str2, Continuation<? super C23634OooO0oo> continuation) {
            super(2, continuation);
            this.f77215OooOoO0 = i;
            this.f77214OooOoO = oooO0OO;
            this.f77216OooOoOO = str;
            this.f77217OooOoo0 = str2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C23634OooO0oo(this.f77215OooOoO0, this.f77214OooOoO, this.f77216OooOoOO, this.f77217OooOoo0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
            return ((C23634OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x006c A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:9:0x001c, B:52:0x0095, B:53:0x00a0, B:15:0x002c, B:40:0x0077, B:42:0x007b, B:44:0x007e, B:46:0x0084, B:48:0x0087, B:16:0x0030, B:35:0x0063, B:37:0x006c, B:17:0x0034, B:24:0x0048, B:26:0x004c, B:28:0x004f, B:30:0x0055, B:32:0x0058, B:21:0x003d), top: B:57:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Folder folder;
            C27600o0ooOO0 c27600o0ooOO0;
            Folder folder2;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77212OooOo;
            String str = this.f77217OooOoo0;
            String str2 = this.f77216OooOoOO;
            int i2 = this.f77215OooOoO0;
            OooO0OO oooO0OO = this.f77214OooOoO;
            try {
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    if (i2 != 0) {
                        if (i2 == 1) {
                        }
                        return Boolean.TRUE;
                    }
                    C27449o00O0OoO c27449o00O0OoO = oooO0OO.f77121OooO0Oo;
                    this.f77212OooOo = 1;
                    obj = c27449o00O0OoO.OooOoOO(str2, this);
                    if (obj == enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                if (i != 1) {
                    if (i == 2) {
                        C32446OooOOOo.OooO0O0(obj);
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        oooO0OO.f77138OooOo00.OooO0Oo(str2, true);
                        if (i2 == 1) {
                            C27600o0ooOO0 c27600o0ooOO02 = oooO0OO.f77124OooO0oO;
                            this.f77212OooOo = 3;
                            obj = c27600o0ooOO02.OooO0Oo(str2, this);
                            if (obj != enumC32485OooO00o) {
                                folder = (Folder) obj;
                                if (folder == null) {
                                    return Boolean.FALSE;
                                }
                                c27600o0ooOO0 = oooO0OO.f77124OooO0oO;
                                this.f77213OooOo0o = folder;
                                this.f77212OooOo = 4;
                                if (c27600o0ooOO0.OooOO0O(folder, str, this) != enumC32485OooO00o) {
                                }
                            }
                            return enumC32485OooO00o;
                        }
                        return Boolean.TRUE;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        folder2 = this.f77213OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                        oooO0OO.f77138OooOo00.OooO0O0(folder2.getId());
                        return Boolean.TRUE;
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    folder = (Folder) obj;
                    if (folder == null && !folder.getInTrashBin()) {
                        c27600o0ooOO0 = oooO0OO.f77124OooO0oO;
                        this.f77213OooOo0o = folder;
                        this.f77212OooOo = 4;
                        if (c27600o0ooOO0.OooOO0O(folder, str, this) != enumC32485OooO00o) {
                            folder2 = folder;
                            C32460OooOooO c32460OooOooO22 = C32460OooOooO.f116667OooO00o;
                            oooO0OO.f77138OooOo00.OooO0O0(folder2.getId());
                            return Boolean.TRUE;
                        }
                        return enumC32485OooO00o;
                    }
                    return Boolean.FALSE;
                }
                C32446OooOOOo.OooO0O0(obj);
                NoteMeta noteMeta = (NoteMeta) obj;
                if (noteMeta != null && !noteMeta.getInTrashBin()) {
                    C27449o00O0OoO c27449o00O0OoO2 = oooO0OO.f77121OooO0Oo;
                    this.f77212OooOo = 2;
                    if (c27449o00O0OoO2.Oooo0oo(noteMeta, str, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    C32460OooOooO c32460OooOooO3 = C32460OooOooO.f116667OooO00o;
                    oooO0OO.f77138OooOo00.OooO0Oo(str2, true);
                    if (i2 == 1) {
                    }
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteListViewModel");
                c20358OooO00o.OooO0Oo(e, "Unable to rename note", new Object[0]);
                return Boolean.FALSE;
            }
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$setSortKey$1", m80623f = "NoteListViewModel.kt", m80624l = {1173}, m80625m = "invokeSuspend")
    public static final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77219OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.p609vo.OooO00o f77220OooOoO0;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$setSortKey$1$1", m80623f = "NoteListViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ com.orion.notein.p607ui.p609vo.OooO00o f77221OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f77222OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(com.orion.notein.p607ui.p609vo.OooO00o oooO00o, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f77221OooOo = oooO00o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f77221OooOo, continuation);
                oooO00o.f77222OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f77222OooOo0o;
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = C27205OooO0OO.f95002OooO00o;
                c24334OooO0O0.OooO0oO(C27205OooO0OO.f95008OooO0oO, this.f77221OooOo.name());
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(com.orion.notein.p607ui.p609vo.OooO00o oooO00o, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f77220OooOoO0 = oooO00o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0OO.this.new OooOO0(this.f77220OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77219OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = OooO0OO.this.f77128OooOO0o;
                OooO00o oooO00o = new OooO00o(this.f77220OooOoO0, null);
                this.f77219OooOo0o = 1;
                if (C24332OooO.OooO00o(oooOO02, oooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$toggleListLayout$1", m80623f = "NoteListViewModel.kt", m80624l = {1898}, m80625m = "invokeSuspend")
    public static final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77224OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ boolean f77225OooOoO0;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$toggleListLayout$1$1", m80623f = "NoteListViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ boolean f77226OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f77227OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(boolean z, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f77226OooOo = z;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f77226OooOo, continuation);
                oooO00o.f77227OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f77227OooOo0o;
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = C27205OooO0OO.f95002OooO00o;
                c24334OooO0O0.OooO0oO(C27205OooO0OO.f95009OooO0oo, Boolean.valueOf(this.f77226OooOo));
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(boolean z, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f77225OooOoO0 = z;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0OO.this.new OooOO0O(this.f77225OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77224OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = OooO0OO.this.f77128OooOO0o;
                OooO00o oooO00o = new OooO00o(this.f77225OooOoO0, null);
                this.f77224OooOo0o = 1;
                if (C24332OooO.OooO00o(oooOO02, oooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public OooO0OO(C27449o00O0OoO c27449o00O0OoO, o000OO o000oo2, C27570o00oOoo0 c27570o00oOoo0, C27600o0ooOO0 c27600o0ooOO0, C27351Oooo0O0 backupUseCase, C27597o00ooo00 vipFeatureUseCase, C26577o000oo0O c26577o000oo0O, C27129OoooOOO c27129OoooOOO, InterfaceC27313OooOoo0 noteMetaRepo, InterfaceC27296OooOO0o docRepo, o0000o0O.OooOO0 dataStore, C27585o00ooO0 c27585o00ooO0, C27499o00Ooo0 pdfFileUseCase, C27538o00o0o0O stickerUseCase, InterfaceC27307OooOo0O lockNoteRepo, InterfaceC27306OooOo00 labelRepo, C27819OooOoo c27819OooOoo, C20813OooO0o0 c20813OooO0o0, o0000OOO syncAllUseCase, o00000O getRemoteConfigUseCase, C27387o0000o0 noteInFileUseCase, o0ooOOo o0ooooo2, Context context) {
        OooOOO0.OooO0oO(backupUseCase, "backupUseCase");
        OooOOO0.OooO0oO(vipFeatureUseCase, "vipFeatureUseCase");
        OooOOO0.OooO0oO(noteMetaRepo, "noteMetaRepo");
        OooOOO0.OooO0oO(docRepo, "docRepo");
        OooOOO0.OooO0oO(dataStore, "dataStore");
        OooOOO0.OooO0oO(pdfFileUseCase, "pdfFileUseCase");
        OooOOO0.OooO0oO(stickerUseCase, "stickerUseCase");
        OooOOO0.OooO0oO(lockNoteRepo, "lockNoteRepo");
        OooOOO0.OooO0oO(labelRepo, "labelRepo");
        OooOOO0.OooO0oO(syncAllUseCase, "syncAllUseCase");
        OooOOO0.OooO0oO(getRemoteConfigUseCase, "getRemoteConfigUseCase");
        OooOOO0.OooO0oO(noteInFileUseCase, "noteInFileUseCase");
        this.f77121OooO0Oo = c27449o00O0OoO;
        this.f77123OooO0o0 = o000oo2;
        this.f77122OooO0o = c27570o00oOoo0;
        this.f77124OooO0oO = c27600o0ooOO0;
        this.f77125OooO0oo = backupUseCase;
        this.f77120OooO = vipFeatureUseCase;
        this.f77126OooOO0 = noteMetaRepo;
        this.f77127OooOO0O = docRepo;
        this.f77128OooOO0o = dataStore;
        this.f77130OooOOO0 = pdfFileUseCase;
        this.f77129OooOOO = stickerUseCase;
        this.f77131OooOOOO = lockNoteRepo;
        this.f77132OooOOOo = labelRepo;
        this.f77134OooOOo0 = c27819OooOoo;
        this.f77133OooOOo = syncAllUseCase;
        this.f77135OooOOoo = noteInFileUseCase;
        this.f77138OooOo00 = o0ooooo2;
        this.f77137OooOo0 = context;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(c34434OooOoO);
        this.f77139OooOo0O = c33781o00o0OOooO00o;
        this.f77140OooOo0o = c33781o00o0OOooO00o;
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o(0);
        this.f77136OooOo = c33781o00o0OOooO00o2;
        C33781o00o0O c33781o00o0OOooO00o3 = C33784o00ooo.OooO00o(0);
        this.f77142OooOoO0 = c33781o00o0OOooO00o3;
        this.f77141OooOoO = c33781o00o0OOooO00o3;
        this.f77143OooOoOO = new LinkedHashMap();
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, executorC33873OooO0O0, null, new Oooo000(this, null), 2);
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f77145OooOoo0 = c33772OooooOoOooO0O0;
        this.f77144OooOoo = c33772OooooOoOooO0O0;
        C33781o00o0O c33781o00o0OOooO00o4 = C33784o00ooo.OooO00o(0);
        this.f77146OooOooO = c33781o00o0OOooO00o4;
        this.f77147OooOooo = c33781o00o0OOooO00o4;
        InterfaceC33721OooO0o<String> flow5 = c27129OoooOOO.OooO0OO();
        this.f77150Oooo000 = flow5;
        C33781o00o0O c33781o00o0OOooO00o5 = C33784o00ooo.OooO00o("desktop");
        this.f77151Oooo00O = c33781o00o0OOooO00o5;
        C33781o00o0O c33781o00o0OOooO00o6 = C33784o00ooo.OooO00o(0L);
        this.f77152Oooo00o = c33781o00o0OOooO00o6;
        C33781o00o0O c33781o00o0OOooO00o7 = C33784o00ooo.OooO00o(0);
        this.f77149Oooo0 = c33781o00o0OOooO00o7;
        this.f77153Oooo0O0 = C25252OooO0Oo.OooOoO0(new C29857Oooooo(c33781o00o0OOooO00o7, this, 1), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f77154Oooo0OO = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(c33781o00o0OOooO00o6, new C30089o00ooo(this, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        C33781o00o0O c33781o00o0OOooO00o8 = C33784o00ooo.OooO00o(C34429OooOOo0.OooOO0o(f77116Oooooo, f77117OoooooO, f77118Ooooooo, f77119o0OoOo0));
        this.f77156Oooo0o0 = c33781o00o0OOooO00o8;
        this.f77155Oooo0o = c33781o00o0OOooO00o8;
        C33781o00o0O c33781o00o0OOooO00o9 = C33784o00ooo.OooO00o(null);
        this.f77157Oooo0oO = c33781o00o0OOooO00o9;
        this.f77158Oooo0oo = c33781o00o0OOooO00o9;
        C33781o00o0O c33781o00o0OOooO00o10 = C33784o00ooo.OooO00o(new C32443OooOOO(null, null));
        this.f77148Oooo = c33781o00o0OOooO00o10;
        this.f77161OoooO00 = c33781o00o0OOooO00o10;
        this.f77160OoooO0 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(c33781o00o0OOooO00o10, new oo000o(this, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null), new C30088o00oO0o(this, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        C33718OooO0O0 c33718OooO0O0OooO0O0 = docRepo.OooO0O0();
        this.f77162OoooO0O = c33718OooO0O0OooO0O0;
        C33763OoooOOO c33763OoooOOO = new C33763OoooOOO(c33781o00o0OOooO00o10, C25252OooO0Oo.OooOo0O(c27449o00O0OoO.f96049OooOOOo.OooO0O0(), executorC33873OooO0O0), new Oooo0(3, null));
        C33769Ooooo0o c33769Ooooo0oOooOoO0 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(C25252OooO0Oo.OooOO0(c33781o00o0OOooO00o7, flow5, c33781o00o0OOooO00o6, c33781o00o0OOooO00o5, c33781o00o0OOooO00o10, new C30056Oooo0O0(this, null)), new o00oO0O(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        C33799OooOO0O c33799OooOO0OOooOoO = C25252OooO0Oo.OooOoO(C25252OooO0Oo.OooO(c33781o00o0OOooO00o10, flow5, c33781o00o0OOooO00o6, c33781o00o0OOooO00o7, new C30055Oooo00o(this, null)), new C30090o0ooOO0(3, null));
        C33799OooOO0O c33799OooOO0OOooOoO2 = C25252OooO0Oo.OooOoO(C25252OooO0Oo.OooOO0(c33781o00o0OOooO00o10, flow5, c33781o00o0OOooO00o2, c33781o00o0OOooO00o3, c33781o00o0OOooO00o7, new C30054Oooo00O(this, null)), new o0o00oOo.o0ooOOo(3, null));
        int i = 1;
        C26894Oooo0o c26894Oooo0o = new C26894Oooo0o(vipFeatureUseCase.OooO0o0(46), i);
        C33769Ooooo0o c33769Ooooo0oOooOoO02 = C25252OooO0Oo.OooOoO0(new o00O0O(dataStore.getData(), i), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), com.orion.notein.p607ui.p609vo.OooO00o.f80085OooOoO);
        this.f77159OoooO = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33769Ooooo0oOooOoO02, c26894Oooo0o, new o00Oo0(3, null)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        C33781o00o0O c33781o00o0OOooO00o11 = C33784o00ooo.OooO00o(new HashSet());
        this.f77163OoooOO0 = c33781o00o0OOooO00o11;
        C33781o00o0O c33781o00o0OOooO00o12 = C33784o00ooo.OooO00o(new HashSet());
        this.f77175o000oOoO = c33781o00o0OOooO00o12;
        this.f77164OoooOOO = C25252OooO0Oo.OooOoO0(new o000000(dataStore.getData(), 0), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        InterfaceC33721OooO0o<String> flow7 = C25252OooO0Oo.OooOo0O(c26577o000oo0O.OooO0O0(App.f69576o00000), executorC33873OooO0O0);
        this.f77165OoooOOo = flow7;
        C33769Ooooo0o c33769Ooooo0oOooOoO03 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOO0o(lockNoteRepo.OooO00o()), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), Boolean.TRUE);
        C33769Ooooo0o c33769Ooooo0oOooOoO04 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(((InterfaceC27605OooO00o) c20813OooO0o0.f59765OooO00o).OooO0o0(), new C27621OooOO0O(null, c20813OooO0o0)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f77166OoooOo0 = c33769Ooooo0oOooOoO04;
        InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0O = C25252OooO0Oo.OooOO0O(C25252OooO0Oo.OooOO0o(new o0o00oOo.o000000O(c33769Ooooo0oOooOoO04)), 100L);
        C33822OooO0OO c33822OooO0OOOooO0oO = C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0);
        C33779o00Oo0 c33779o00Oo0OooO00o = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        C34436OooOoOO c34436OooOoOO = C34436OooOoOO.f123455OooOo0o;
        this.f77167OoooOoO = C25252OooO0Oo.OooOoO0(interfaceC33721OooO0oOooOO0O, c33822OooO0OOOooO0oO, c33779o00Oo0OooO00o, c34436OooOoOO);
        C33781o00o0O c33781o00o0OOooO00o13 = C33784o00ooo.OooO00o(new ImportFileResult(Integer.MIN_VALUE, "", null, 4, null));
        C33772OooooOo c33772OooooOoOooO0O02 = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f77168OoooOoo = c33772OooooOoOooO0O02;
        this.f77169Ooooo00 = new o000Oo0(c33772OooooOoOooO0O02, new o000oOoO(2, new C30067OoooOOO(c33781o00o0OOooO00o13, InterfaceC33767OoooOoo.class, "value", "getValue()Ljava/lang/Object;", 0), InterfaceC34591OooO.class, "set", "set(Ljava/lang/Object;)V", 4), 1);
        C33769Ooooo0o c33769Ooooo0oOooOoO05 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(c33799OooOO0OOooOoO, new C30091o0ooOoO(this, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34436OooOoOO);
        C33769Ooooo0o c33769Ooooo0oOooOoO06 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(c33799OooOO0OOooOoO2, new o0OOO0o(this, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34436OooOoOO);
        C33769Ooooo0o c33769Ooooo0oOooOoO07 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(c33769Ooooo0oOooOoO0, new o0Oo0oo(this, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34436OooOoOO);
        o0o00oOo.o00000 o00000Var = new o0o00oOo.o00000(new C30081o000000o(C28051OooO00o.OooO00o(context).getData()));
        C33777o000oOoO c33777o000oOoOOooOO0 = C25252OooO0Oo.OooOO0(c33799OooOO0OOooOoO, c33799OooOO0OOooOoO2, c33769Ooooo0oOooOoO0, c33763OoooOOO, c33718OooO0O0OooO0O0, new com.orion.notein.p607ui.notelist.OooO(null));
        C33758OoooO c33758OoooOOooO0oo = C25252OooO0Oo.OooO0oo(c33769Ooooo0oOooOoO05, c33769Ooooo0oOooOoO06, c33769Ooooo0oOooOoO07, new C23635OooO0Oo(4, null));
        C23639OooOO0o c23639OooOO0o = new C23639OooOO0o(null);
        OooOOO0.OooO0oO(flow5, "flow5");
        OooOOO0.OooO0oO(flow7, "flow7");
        C33769Ooooo0o c33769Ooooo0oOooOoO08 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOO0o(new C33763OoooOOO(new C33763OoooOOO(new C33763OoooOOO(new C33763OoooOOO(c33777o000oOoOOooOO0, C25252OooO0Oo.OooO0oo(C25252OooO0Oo.OooO0oo(c33769Ooooo0oOooOoO02, c33781o00o0OOooO00o4, c33781o00o0OOooO00o11, C28056OooO0Oo.f99456OooOooO), C25252OooO0Oo.OooO0oo(c33781o00o0OOooO00o12, flow5, c33781o00o0OOooO00o5, C28058OooO0o0.f99458OooOooO), C25252OooO0Oo.OooO0oo(flow7, c33769Ooooo0oOooOoO03, o00000Var, C28057OooO0o.f99457OooOooO), new C28059OooO0oO(c23639OooOO0o, null)), new com.orion.notein.p607ui.notelist.OooOO0(this, null)), c33781o00o0OOooO00o13, new C30075OooooOO(3, null)), c33758OoooOOooO0oo, new com.orion.notein.p607ui.notelist.OooOO0O(this, null)), c33781o00o0OOooO00o9, new C30076OooooOo(3, null))), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f77170Ooooo0o = c33769Ooooo0oOooOoO08;
        C33799OooOO0O c33799OooOO0OOooOoO3 = C25252OooO0Oo.OooOoO(flow5, new o00Ooo(this, null));
        this.f77171OooooO0 = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(C25252OooO0Oo.OooO(c33799OooOO0OOooOoO3, flow5, flow7, c33769Ooooo0oOooOoO03, new C30079OoooooO(5, null)), C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(c33799OooOO0OOooOoO3, new C30087o00o0O(this, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34436OooOoOO), new C30080Ooooooo(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f77172OooooOO = C25252OooO0Oo.OooOoO0(new o00000O0(c33769Ooooo0oOooOoO08), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f77174Oooooo0 = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0089 -> B:40:0x00bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008f -> B:40:0x00bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a0 -> B:36:0x00a1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o(OooO0OO oooO0OO, List list, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C30070OoooOoO c30070OoooOoO;
        Iterator<Map.Entry<? extends String, ? extends InterfaceC33642Oooo0oo<C32460OooOooO>>> it;
        OooO0OO oooO0OO2;
        oooO0OO.getClass();
        if (abstractC32479OooO0OO instanceof C30070OoooOoO) {
            c30070OoooOoO = (C30070OoooOoO) abstractC32479OooO0OO;
            int i = c30070OoooOoO.f106976OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30070OoooOoO.f106976OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c30070OoooOoO = new C30070OoooOoO(oooO0OO, abstractC32479OooO0OO);
            }
        }
        C30070OoooOoO c30070OoooOoO2 = c30070OoooOoO;
        Object objOooO0oO = c30070OoooOoO2.f106973OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c30070OoooOoO2.f106976OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oO);
            c30070OoooOoO2.f106972OooOo0o = oooO0OO;
            c30070OoooOoO2.f106976OooOoo0 = 1;
            objOooO0oO = oooO0OO.f77123OooO0o0.OooO0oO(list, str, null, null, c30070OoooOoO2);
            if (objOooO0oO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else if (i2 == 1) {
            oooO0OO = c30070OoooOoO2.f106972OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0oO);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = c30070OoooOoO2.f106974OooOoO0;
            it = c30070OoooOoO2.f106971OooOo;
            oooO0OO2 = c30070OoooOoO2.f106972OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooO0oO);
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0Oo(e, C22201OooO0oO.OooO0O0(c20358OooO00o, "NoteListViewModel", "importFilesSerially.foreach job for(", str2, ") cancelled."), new Object[0]);
            }
            String key = str2;
            InterfaceC33642Oooo0oo<C32460OooOooO> interfaceC33642Oooo0ooRemove = oooO0OO2.f77174Oooooo0.remove(key);
            if (interfaceC33642Oooo0ooRemove != null) {
                interfaceC33642Oooo0ooRemove.cancel(C28035OooO00o.OooO00o("Cancelled due to normal completion.", null));
            }
            if (it.hasNext()) {
                Map.Entry<? extends String, ? extends InterfaceC33642Oooo0oo<C32460OooOooO>> next = it.next();
                key = next.getKey();
                InterfaceC33642Oooo0oo<C32460OooOooO> value = next.getValue();
                try {
                } catch (Exception e2) {
                    str2 = key;
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooO0Oo(e2, C22201OooO0oO.OooO0O0(c20358OooO00o2, "NoteListViewModel", "importFilesSerially.foreach job for(", str2, ") cancelled."), new Object[0]);
                }
                if (!value.isCancelled() && !value.isCompleted()) {
                    c30070OoooOoO2.f106972OooOo0o = oooO0OO2;
                    c30070OoooOoO2.f106971OooOo = it;
                    c30070OoooOoO2.f106974OooOoO0 = key;
                    c30070OoooOoO2.f106976OooOoo0 = 2;
                    if (value.await(c30070OoooOoO2) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    str2 = key;
                    String key2 = str2;
                }
                InterfaceC33642Oooo0oo<C32460OooOooO> interfaceC33642Oooo0ooRemove2 = oooO0OO2.f77174Oooooo0.remove(key2);
                if (interfaceC33642Oooo0ooRemove2 != null) {
                }
                if (it.hasNext()) {
                    return C32460OooOooO.f116667OooO00o;
                }
            }
        }
        Map<? extends String, ? extends InterfaceC33642Oooo0oo<C32460OooOooO>> map = (Map) objOooO0oO;
        oooO0OO.f77174Oooooo0.putAll(map);
        it = map.entrySet().iterator();
        oooO0OO2 = oooO0OO;
        if (it.hasNext()) {
        }
    }

    public static final NoteVO OooO0o0(OooO0OO oooO0OO, Folder folder) {
        oooO0OO.getClass();
        return new NoteVO(folder.getId(), null, folder.getUserId(), folder.getTitle(), folder.getParentId(), folder.getTnPath(), o000000O.OooO0o(93), o000000O.OooO0o(130), PaperOrientation.VERTICAL, false, folder.getCreationTime(), folder.getLastModificationTime(), false, false, folder.getFavorite(), 0, 1, null, null, null, null, null, null, 0, null, false, false, 0L, false, null, false, 2147352578, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x048a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02c2 A[LOOP:1: B:56:0x02bc->B:58:0x02c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0426  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO(OooO0O0 oooO0O0, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C23638OooO0oo c23638OooO0oo;
        String str;
        OooO00o oooO00o;
        OooO0OO oooO0OO;
        OooO0OO oooO0OO2;
        List list;
        Object objOooO0oO;
        OooO0O0 oooO0O02;
        OooO00o oooO00o2;
        OooO0OO oooO0OO3;
        List list2;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        int i;
        List listO00O0O;
        ArrayList arrayList3;
        Iterator it2;
        int i2;
        Object next;
        OooO0O0 oooO0O03 = oooO0O0;
        if (abstractC32479OooO0OO instanceof C23638OooO0oo) {
            c23638OooO0oo = (C23638OooO0oo) abstractC32479OooO0OO;
            int i3 = c23638OooO0oo.f77269OooOoo;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c23638OooO0oo.f77269OooOoo = i3 - Integer.MIN_VALUE;
            } else {
                c23638OooO0oo = new C23638OooO0oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c23638OooO0oo.f77268OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c23638OooO0oo.f77269OooOoo;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteListViewModel");
            int size = oooO0O03.f77188OooO00o.f77190OooO00o.size();
            C19405OooO0OO c19405OooO0OO = oooO0O03.f77188OooO00o;
            int size2 = c19405OooO0OO.f77191OooO0O0.size();
            List<Page> list3 = c19405OooO0OO.f77192OooO0OO;
            int size3 = list3.size();
            int size4 = c19405OooO0OO.f77193OooO0Oo.size();
            C23632OooO0o0 c23632OooO0o0 = oooO0O03.f77189OooO0O0;
            boolean z = c23632OooO0o0.f77200OooO;
            str = "NoteListViewModel";
            StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("combineNoteVOList called with ", size, " metas, ", " folders, ", size2);
            C24472OooOoo.OooO0O0(sbOooO0O0, " pages, ", " placeholders, isFlat: ", size3, size4);
            c20358OooO00o.OooO00o(OooOOO.OooO00o(sbOooO0O0, ".", z), new Object[0]);
            if (c23632OooO0o0.f77200OooO) {
                InterfaceC33721OooO0o<List<NoteMeta>> interfaceC33721OooO0oOooOOo = this.f77121OooO0Oo.OooOOo(c23632OooO0o0.f77206OooO0o0);
                c23638OooO0oo.f77265OooOo0o = this;
                c23638OooO0oo.f77264OooOo = oooO0O03;
                c23638OooO0oo.f77269OooOoo = 1;
                objOooOOo = C25252OooO0Oo.OooOOo(interfaceC33721OooO0oOooOOo, c23638OooO0oo);
                if (objOooOOo != enumC32485OooO00o) {
                    oooO0OO2 = this;
                    List metas = (List) objOooOOo;
                    C19405OooO0OO c19405OooO0OO2 = oooO0O03.f77188OooO00o;
                    C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
                    List<NotePlaceHolder> placeholders = c19405OooO0OO2.f77193OooO0Oo;
                    OooOOO0.OooO0oO(metas, "metas");
                    OooOOO0.OooO0oO(placeholders, "placeholders");
                    Map<String, Integer> importPlaceHolderProgress = c19405OooO0OO2.f77194OooO0o0;
                    OooOOO0.OooO0oO(importPlaceHolderProgress, "importPlaceHolderProgress");
                    C19405OooO0OO c19405OooO0OO3 = new C19405OooO0OO(metas, c34434OooOoO, c34434OooOoO, placeholders, importPlaceHolderProgress);
                    C23632OooO0o0 c23632OooO0o02 = oooO0O03.f77189OooO0O0;
                    com.orion.notein.p607ui.p609vo.OooO00o sortKey = c23632OooO0o02.f77201OooO00o;
                    OooOOO0.OooO0oO(sortKey, "sortKey");
                    Set<String> selectedNotes = c23632OooO0o02.f77203OooO0OO;
                    OooOOO0.OooO0oO(selectedNotes, "selectedNotes");
                    Set<String> selectedFolders = c23632OooO0o02.f77204OooO0Oo;
                    OooOOO0.OooO0oO(selectedFolders, "selectedFolders");
                    String uid = c23632OooO0o02.f77206OooO0o0;
                    OooOOO0.OooO0oO(uid, "uid");
                    String topFolder = c23632OooO0o02.f77205OooO0o;
                    OooOOO0.OooO0oO(topFolder, "topFolder");
                    String dateFormat = c23632OooO0o02.f77207OooO0oO;
                    OooOOO0.OooO0oO(dateFormat, "dateFormat");
                    OooO0O0 oooO0O04 = new OooO0O0(c19405OooO0OO3, new C23632OooO0o0(sortKey, c23632OooO0o02.f77202OooO0O0, selectedNotes, selectedFolders, uid, topFolder, dateFormat, c23632OooO0o02.f77208OooO0oo, false));
                    c23638OooO0oo.f77265OooOo0o = null;
                    c23638OooO0oo.f77264OooOo = null;
                    c23638OooO0oo.f77269OooOoo = 2;
                    Object objOooO = oooO0OO2.OooO(oooO0O04, c23638OooO0oo);
                    if (objOooO != enumC32485OooO00o) {
                    }
                }
            } else {
                OooO00o oooO00o3 = new OooO00o(c23632OooO0o0.f77206OooO0o0, c23632OooO0o0.f77205OooO0o, c19405OooO0OO.f77194OooO0o0, new SimpleDateFormat(c23632OooO0o0.f77207OooO0oO, Locale.getDefault()), c23632OooO0o0.f77202OooO0O0 == 1, c23632OooO0o0.f77203OooO0OO, c23632OooO0o0.f77204OooO0Oo, c23632OooO0o0.f77208OooO0oo);
                c23638OooO0oo.f77265OooOo0o = this;
                c23638OooO0oo.f77264OooOo = oooO0O03;
                c23638OooO0oo.f77267OooOoO0 = oooO00o3;
                c23638OooO0oo.f77269OooOoo = 3;
                Serializable serializableOooO0oo = OooO0oo(list3, oooO00o3, c23638OooO0oo);
                if (serializableOooO0oo != enumC32485OooO00o) {
                    oooO00o = oooO00o3;
                    objOooOOo = serializableOooO0oo;
                    oooO0OO = this;
                    list = (List) objOooOOo;
                    List<Folder> list4 = oooO0O03.f77188OooO00o.f77191OooO0O0;
                    c23638OooO0oo.f77265OooOo0o = oooO0OO;
                    c23638OooO0oo.f77264OooOo = oooO0O03;
                    c23638OooO0oo.f77267OooOoO0 = oooO00o;
                    c23638OooO0oo.f77266OooOoO = list;
                    c23638OooO0oo.f77269OooOoo = 4;
                    objOooO0oO = oooO0OO.OooO0oO(list4, oooO00o, c23638OooO0oo);
                    if (objOooO0oO != enumC32485OooO00o) {
                    }
                }
            }
        }
        if (i4 == 1) {
            oooO0O03 = c23638OooO0oo.f77264OooOo;
            oooO0OO2 = c23638OooO0oo.f77265OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
            List metas2 = (List) objOooOOo;
            C19405OooO0OO c19405OooO0OO22 = oooO0O03.f77188OooO00o;
            C34434OooOoO c34434OooOoO2 = C34434OooOoO.f123453OooOo0o;
            List<NotePlaceHolder> placeholders2 = c19405OooO0OO22.f77193OooO0Oo;
            OooOOO0.OooO0oO(metas2, "metas");
            OooOOO0.OooO0oO(placeholders2, "placeholders");
            Map<String, Integer> importPlaceHolderProgress2 = c19405OooO0OO22.f77194OooO0o0;
            OooOOO0.OooO0oO(importPlaceHolderProgress2, "importPlaceHolderProgress");
            C19405OooO0OO c19405OooO0OO32 = new C19405OooO0OO(metas2, c34434OooOoO2, c34434OooOoO2, placeholders2, importPlaceHolderProgress2);
            C23632OooO0o0 c23632OooO0o022 = oooO0O03.f77189OooO0O0;
            com.orion.notein.p607ui.p609vo.OooO00o sortKey2 = c23632OooO0o022.f77201OooO00o;
            OooOOO0.OooO0oO(sortKey2, "sortKey");
            Set<String> selectedNotes2 = c23632OooO0o022.f77203OooO0OO;
            OooOOO0.OooO0oO(selectedNotes2, "selectedNotes");
            Set<String> selectedFolders2 = c23632OooO0o022.f77204OooO0Oo;
            OooOOO0.OooO0oO(selectedFolders2, "selectedFolders");
            String uid2 = c23632OooO0o022.f77206OooO0o0;
            OooOOO0.OooO0oO(uid2, "uid");
            String topFolder2 = c23632OooO0o022.f77205OooO0o;
            OooOOO0.OooO0oO(topFolder2, "topFolder");
            String dateFormat2 = c23632OooO0o022.f77207OooO0oO;
            OooOOO0.OooO0oO(dateFormat2, "dateFormat");
            OooO0O0 oooO0O042 = new OooO0O0(c19405OooO0OO32, new C23632OooO0o0(sortKey2, c23632OooO0o022.f77202OooO0O0, selectedNotes2, selectedFolders2, uid2, topFolder2, dateFormat2, c23632OooO0o022.f77208OooO0oo, false));
            c23638OooO0oo.f77265OooOo0o = null;
            c23638OooO0oo.f77264OooOo = null;
            c23638OooO0oo.f77269OooOoo = 2;
            Object objOooO2 = oooO0OO2.OooO(oooO0O042, c23638OooO0oo);
            return objOooO2 != enumC32485OooO00o ? enumC32485OooO00o : objOooO2;
        }
        if (i4 == 2) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            return objOooOOo;
        }
        if (i4 == 3) {
            OooO00o oooO00o4 = c23638OooO0oo.f77267OooOoO0;
            OooO0O0 oooO0O05 = c23638OooO0oo.f77264OooOo;
            oooO0OO = c23638OooO0oo.f77265OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
            oooO00o = oooO00o4;
            oooO0O03 = oooO0O05;
            str = "NoteListViewModel";
            list = (List) objOooOOo;
            List<Folder> list42 = oooO0O03.f77188OooO00o.f77191OooO0O0;
            c23638OooO0oo.f77265OooOo0o = oooO0OO;
            c23638OooO0oo.f77264OooOo = oooO0O03;
            c23638OooO0oo.f77267OooOoO0 = oooO00o;
            c23638OooO0oo.f77266OooOoO = list;
            c23638OooO0oo.f77269OooOoo = 4;
            objOooO0oO = oooO0OO.OooO0oO(list42, oooO00o, c23638OooO0oo);
            if (objOooO0oO != enumC32485OooO00o) {
                oooO0O02 = oooO0O03;
                oooO00o2 = oooO00o;
                oooO0OO3 = oooO0OO;
                list2 = (List) objOooO0oO;
                List<NoteMeta> list5 = oooO0O02.f77188OooO00o.f77190OooO00o;
                oooO0OO3.getClass();
                List<NoteMeta> list6 = list5;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list6, 10));
                while (r0.hasNext()) {
                }
                List<NotePlaceHolder> list7 = oooO0O02.f77188OooO00o.f77193OooO0Oo;
                ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                }
                Set setO0OO00O = OooOo.o0OO00O(arrayList4);
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO0OO3);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C23637OooO0oO(list7, setO0OO00O, oooO0OO3, null), 2);
                ArrayList<NotePlaceHolder> arrayList5 = new ArrayList();
                while (r0.hasNext()) {
                }
                arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList5, 10));
                while (r0.hasNext()) {
                }
                listO00O0O = OooOo.o00O0O(OooOo.OooooOO(OooOo.OooooOO(OooOo.OooooOO(arrayList2, arrayList), list2), list), new C29651OooOOo0(new C29649OooOOOo(oooO0O02, 1), 1));
                i = 0;
                List list8 = listO00O0O;
                arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list8, 10));
                it2 = list8.iterator();
                while (true) {
                    i2 = i;
                    if (it2.hasNext()) {
                    }
                    arrayList3.add(NoteVO.copy$default((NoteVO) next, null, null, null, null, null, null, 0, 0, null, false, 0L, 0L, false, false, false, 0, 0, null, null, null, new Integer(i2), null, null, 0, null, false, false, 0L, false, null, false, 2146435071, null));
                }
            }
        }
        if (i4 != 4) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list9 = c23638OooO0oo.f77266OooOoO;
        oooO00o2 = c23638OooO0oo.f77267OooOoO0;
        oooO0O02 = c23638OooO0oo.f77264OooOo;
        oooO0OO3 = c23638OooO0oo.f77265OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOOo);
        objOooO0oO = objOooOOo;
        str = "NoteListViewModel";
        list = list9;
        list2 = (List) objOooO0oO;
        List<NoteMeta> list52 = oooO0O02.f77188OooO00o.f77190OooO00o;
        oooO0OO3.getClass();
        List<NoteMeta> list62 = list52;
        arrayList = new ArrayList(C34428OooOOo.OooOOoo(list62, 10));
        for (NoteMeta noteMeta : list62) {
            C32443OooOOO c32443OooOOO = noteMeta.getUnboundedNote() ? new C32443OooOOO(Integer.valueOf(o000000O.OooO0o(97)), Integer.valueOf(o000000O.OooO0o(130))) : new C32443OooOOO(Integer.valueOf(noteMeta.getTnWidth()), Integer.valueOf(noteMeta.getTnHeight()));
            int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
            int iIntValue2 = ((Number) c32443OooOOO.f116637OooOo).intValue();
            String title = noteMeta.getTitle();
            String id = noteMeta.getId();
            String str2 = oooO00o2.f77180OooO00o;
            String tnPath = noteMeta.getTnPath();
            PaperOrientation paperOrientation = PaperOrientation.VERTICAL;
            boolean z2 = noteMeta.getPdfInfo() != null;
            long creationTime = noteMeta.getCreationTime();
            long lastModificationTime = noteMeta.getLastModificationTime();
            boolean zContains = oooO00o2.f77184OooO0o.contains(noteMeta.getId());
            String parentId = noteMeta.getParentId();
            int totalPagesCount = noteMeta.getTotalPagesCount();
            boolean favorite = noteMeta.getFavorite();
            Integer sortKey3 = noteMeta.getSortKey();
            boolean unboundedNote = noteMeta.getUnboundedNote();
            arrayList.add(new NoteVO(id, null, str2, title, parentId, tnPath, iIntValue, iIntValue2, paperOrientation, z2, creationTime, lastModificationTime, oooO00o2.f77185OooO0o0, zContains, favorite, totalPagesCount, 0, null, null, null, sortKey3, null, Boolean.valueOf(unboundedNote), 0, oooO00o2.f77183OooO0Oo.format(Long.valueOf(noteMeta.getCreationTime())), noteMeta.getLockAdded(), oooO00o2.f77187OooO0oo, 0L, false, null, false, 2023882754, null));
        }
        List<NotePlaceHolder> list72 = oooO0O02.f77188OooO00o.f77193OooO0Oo;
        ArrayList arrayList42 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList42.add(((NoteVO) it.next()).getId());
        }
        Set setO0OO00O2 = OooOo.o0OO00O(arrayList42);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = o0OoOo0.OooO00o(oooO0OO3);
        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o2, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C23637OooO0oO(list72, setO0OO00O2, oooO0OO3, null), 2);
        ArrayList<NotePlaceHolder> arrayList52 = new ArrayList();
        for (Object obj : list72) {
            boolean zContains2 = setO0OO00O2.contains(((NotePlaceHolder) obj).getId());
            boolean zOooO0O0 = OooOOO0.OooO0O0(oooO00o2.f77181OooO0O0, NoteMeta.PROPERTY_FAVORITE);
            if (!zContains2 && !zOooO0O0) {
                arrayList52.add(obj);
            }
        }
        arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList52, 10));
        for (NotePlaceHolder notePlaceHolder : arrayList52) {
            String id2 = notePlaceHolder.getId();
            String str3 = oooO00o2.f77180OooO00o;
            String title2 = notePlaceHolder.getTitle();
            int iOooO0o = o000000O.OooO0o(93);
            int iOooO0o2 = o000000O.OooO0o(140);
            PaperOrientation paperOrientation2 = PaperOrientation.VERTICAL;
            boolean z3 = notePlaceHolder.getFilePath() != null;
            long creationTime2 = notePlaceHolder.getCreationTime();
            String parentId2 = notePlaceHolder.getParentId();
            int state = notePlaceHolder.getState();
            arrayList2.add(new NoteVO(id2, null, str3, title2, parentId2, "", iOooO0o, iOooO0o2, paperOrientation2, z3, creationTime2, 0L, oooO00o2.f77185OooO0o0, false, false, 0, 3, null, Integer.valueOf(state), null, null, oooO00o2.f77182OooO0OO.get(notePlaceHolder.getId()), null, 0, oooO00o2.f77183OooO0Oo.format(Long.valueOf(notePlaceHolder.getCreationTime())), false, false, 0L, false, null, false, 2128216066, null));
        }
        try {
            listO00O0O = OooOo.o00O0O(OooOo.OooooOO(OooOo.OooooOO(OooOo.OooooOO(arrayList2, arrayList), list2), list), new C29651OooOOo0(new C29649OooOOOo(oooO0O02, 1), 1));
            i = 0;
        } catch (Exception e) {
            ArrayList arrayListOooooOO = OooOo.OooooOO(OooOo.OooooOO(OooOo.OooooOO(arrayList2, arrayList), list2), list);
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0(str);
            i = 0;
            c20358OooO00o2.OooO0Oo(e, C20593OooO0Oo.OooO0O0("NoteListVm.sortWith err: ", OooOo.o000oOoO(arrayListOooooOO, null, null, null, new C27376o000000o(2), 31), "."), new Object[0]);
            listO00O0O = arrayListOooooOO;
        }
        List list82 = listO00O0O;
        arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list82, 10));
        it2 = list82.iterator();
        while (true) {
            i2 = i;
            if (it2.hasNext()) {
                return arrayList3;
            }
            next = it2.next();
            i = i2 + 1;
            if (i2 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            arrayList3.add(NoteVO.copy$default((NoteVO) next, null, null, null, null, null, null, 0, 0, null, false, 0L, 0L, false, false, false, 0, 0, null, null, null, new Integer(i2), null, null, 0, null, false, false, 0L, false, null, false, 2146435071, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0152 -> B:12:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(List list, OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C23636OooO0o0 c23636OooO0o0;
        OooO0OO oooO0OO;
        C23636OooO0o0 c23636OooO0o02;
        Collection arrayList;
        Iterator it;
        OooO0OO oooO0OO2;
        OooO00o oooO00o2;
        if (abstractC32479OooO0OO instanceof C23636OooO0o0) {
            c23636OooO0o0 = (C23636OooO0o0) abstractC32479OooO0OO;
            int i = c23636OooO0o0.f77256OoooO00;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23636OooO0o0.f77256OoooO00 = i - Integer.MIN_VALUE;
                oooO0OO = this;
            } else {
                oooO0OO = this;
                c23636OooO0o0 = new C23636OooO0o0(oooO0OO, abstractC32479OooO0OO);
            }
        }
        Object obj = c23636OooO0o0.f77255Oooo0oo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c23636OooO0o0.f77256OoooO00;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List list2 = list;
            c23636OooO0o02 = c23636OooO0o0;
            arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            it = list2.iterator();
            oooO0OO2 = oooO0OO;
            oooO00o2 = oooO00o;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z = c23636OooO0o0.f77254Oooo0oO;
            boolean z2 = c23636OooO0o0.f77252Oooo0o;
            long j = c23636OooO0o0.f77253Oooo0o0;
            long j2 = c23636OooO0o0.f77251Oooo0OO;
            int iOooO0o = c23636OooO0o0.f77250Oooo0O0;
            int iOooO0o2 = c23636OooO0o0.f77246Oooo0;
            Collection collection = c23636OooO0o0.f77249Oooo00o;
            String str = c23636OooO0o0.f77248Oooo00O;
            PaperOrientation paperOrientation = c23636OooO0o0.f77247Oooo000;
            String str2 = c23636OooO0o0.f77244OooOooo;
            String str3 = c23636OooO0o0.f77243OooOooO;
            String str4 = c23636OooO0o0.f77241OooOoo;
            String str5 = c23636OooO0o0.f77242OooOoo0;
            Folder folder = c23636OooO0o0.f77240OooOoOO;
            Iterator it2 = c23636OooO0o0.f77238OooOoO;
            Collection collection2 = c23636OooO0o0.f77239OooOoO0;
            OooO00o oooO00o3 = c23636OooO0o0.f77236OooOo;
            OooO0OO oooO0OO3 = c23636OooO0o0.f77237OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            String str6 = str3;
            String str7 = str4;
            boolean z3 = z;
            String str8 = str2;
            boolean z4 = z2;
            long j3 = j;
            long j4 = j2;
            String str9 = str;
            OooO00o oooO00o4 = oooO00o3;
            oooO0OO2 = oooO0OO3;
            c23636OooO0o02 = c23636OooO0o0;
            EnumC32485OooO00o enumC32485OooO00o2 = enumC32485OooO00o;
            Object objOooO0o = obj;
            Collection collection3 = collection2;
            String str10 = str5;
            Iterator it3 = it2;
            int i3 = iOooO0o;
            int i4 = iOooO0o2;
            PaperOrientation paperOrientation2 = paperOrientation;
            int iIntValue = ((Number) objOooO0o).intValue();
            boolean favorite = folder.getFavorite();
            Integer sortKey = folder.getSortKey();
            Integer coverColor = folder.getCoverColor();
            collection.add(new NoteVO(str10, null, str7, str6, str9, str8, i4, i3, paperOrientation2, false, j4, j3, z4, z3, favorite, iIntValue, 1, null, null, null, sortKey, null, null, coverColor == null ? coverColor.intValue() : C27996OooO00o.f99274OooO00o, oooO00o4.f77183OooO0Oo.format(new Long(folder.getCreationTime())), false, false, 0L, false, null, false, 2121138178, null));
            oooO00o2 = oooO00o4;
            arrayList = collection3;
            enumC32485OooO00o = enumC32485OooO00o2;
            it = it3;
            if (it.hasNext()) {
                Folder folder2 = (Folder) it.next();
                String id = folder2.getId();
                String str11 = oooO00o2.f77180OooO00o;
                String title = folder2.getTitle();
                String tnPath = folder2.getTnPath();
                iOooO0o2 = o000000O.OooO0o(93);
                iOooO0o = o000000O.OooO0o(130);
                paperOrientation = PaperOrientation.VERTICAL;
                Collection collection4 = arrayList;
                long creationTime = folder2.getCreationTime();
                EnumC32485OooO00o enumC32485OooO00o3 = enumC32485OooO00o;
                long lastModificationTime = folder2.getLastModificationTime();
                boolean zContains = oooO00o2.f77186OooO0oO.contains(folder2.getId());
                String parentId = folder2.getParentId();
                C27600o0ooOO0 c27600o0ooOO0 = oooO0OO2.f77124OooO0oO;
                String id2 = folder2.getId();
                c23636OooO0o02.f77237OooOo0o = oooO0OO2;
                c23636OooO0o02.f77236OooOo = oooO00o2;
                OooO0OO oooO0OO4 = oooO0OO2;
                Collection collection5 = collection4;
                c23636OooO0o02.f77239OooOoO0 = collection5;
                c23636OooO0o02.f77238OooOoO = it;
                c23636OooO0o02.f77240OooOoOO = folder2;
                c23636OooO0o02.f77242OooOoo0 = id;
                c23636OooO0o02.f77241OooOoo = str11;
                c23636OooO0o02.f77243OooOooO = title;
                c23636OooO0o02.f77244OooOooo = tnPath;
                c23636OooO0o02.f77247Oooo000 = paperOrientation;
                c23636OooO0o02.f77248Oooo00O = parentId;
                c23636OooO0o02.f77249Oooo00o = collection5;
                c23636OooO0o02.f77246Oooo0 = iOooO0o2;
                c23636OooO0o02.f77250Oooo0O0 = iOooO0o;
                c23636OooO0o02.f77251Oooo0OO = creationTime;
                c23636OooO0o02.f77253Oooo0o0 = lastModificationTime;
                it3 = it;
                boolean z5 = oooO00o2.f77185OooO0o0;
                c23636OooO0o02.f77252Oooo0o = z5;
                OooO00o oooO00o5 = oooO00o2;
                c23636OooO0o02.f77254Oooo0oO = zContains;
                c23636OooO0o02.f77256OoooO00 = 1;
                c27600o0ooOO0.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0O0O00(c27600o0ooOO0, id2, null), c23636OooO0o02);
                enumC32485OooO00o2 = enumC32485OooO00o3;
                if (objOooO0o == enumC32485OooO00o2) {
                    return enumC32485OooO00o2;
                }
                collection3 = collection4;
                z3 = zContains;
                str8 = tnPath;
                j4 = creationTime;
                oooO00o4 = oooO00o5;
                oooO0OO2 = oooO0OO4;
                z4 = z5;
                j3 = lastModificationTime;
                collection = collection3;
                folder = folder2;
                str10 = id;
                str7 = str11;
                str6 = title;
                str9 = parentId;
                int i32 = iOooO0o;
                int i42 = iOooO0o2;
                PaperOrientation paperOrientation22 = paperOrientation;
                int iIntValue2 = ((Number) objOooO0o).intValue();
                boolean favorite2 = folder.getFavorite();
                Integer sortKey2 = folder.getSortKey();
                Integer coverColor2 = folder.getCoverColor();
                collection.add(new NoteVO(str10, null, str7, str6, str9, str8, i42, i32, paperOrientation22, false, j4, j3, z4, z3, favorite2, iIntValue2, 1, null, null, null, sortKey2, null, null, coverColor2 == null ? coverColor2.intValue() : C27996OooO00o.f99274OooO00o, oooO00o4.f77183OooO0Oo.format(new Long(folder.getCreationTime())), false, false, 0L, false, null, false, 2121138178, null));
                oooO00o2 = oooO00o4;
                arrayList = collection3;
                enumC32485OooO00o = enumC32485OooO00o2;
                it = it3;
                if (it.hasNext()) {
                    return (List) arrayList;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0oo(List list, OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        com.orion.notein.p607ui.notelist.OooO0o oooO0o;
        List list2;
        OooO00o oooO00o2 = oooO00o;
        if (abstractC32479OooO0OO instanceof com.orion.notein.p607ui.notelist.OooO0o) {
            oooO0o = (com.orion.notein.p607ui.notelist.OooO0o) abstractC32479OooO0OO;
            int i = oooO0o.f77235OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f77235OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new com.orion.notein.p607ui.notelist.OooO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOOo = oooO0o.f77234OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0o.f77235OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOOo);
            List list3 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((Page) it.next()).getNoteId());
            }
            String str = oooO00o2.f77180OooO00o;
            oooO0o.f77232OooOo0o = list;
            oooO0o.f77231OooOo = oooO00o2;
            oooO0o.f77235OooOoOO = 1;
            objOooOOOo = this.f77126OooOO0.OooOOOo(str, arrayList, oooO0o);
            if (objOooOOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            list2 = list;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO00o2 = oooO0o.f77231OooOo;
            list2 = oooO0o.f77232OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOOo);
        }
        Map map = (Map) objOooOOOo;
        List<Page> list4 = list2;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
        for (Page page : list4) {
            C32443OooOOO<Integer, Integer> tnSize = page.getTnSize();
            int iIntValue = tnSize.f116638OooOo0o.intValue();
            int iIntValue2 = tnSize.f116637OooOo.intValue();
            String id = page.getId();
            String noteId = page.getNoteId();
            String str2 = oooO00o2.f77180OooO00o;
            String str3 = (String) map.get(page.getNoteId());
            if (str3 == null) {
                str3 = "untitled";
            }
            arrayList2.add(new NoteVO(id, noteId, str2, str3, null, page.getTnPath(), iIntValue, iIntValue2, page.getPaperOrientation(), page.getPaperTheme() instanceof PdfPaperTheme, page.getCreationTime(), page.getLastModificationTime(), oooO00o2.f77185OooO0o0, false, false, 1, 2, null, null, null, null, null, null, 0, oooO00o2.f77183OooO0Oo.format(new Long(page.getCreationTime())), false, false, 0L, false, null, false, 1056833536, null));
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30060Oooo0oO c30060Oooo0oO;
        OooO0OO oooO0OO;
        OooO0OO oooO0OO2;
        if (abstractC32479OooO0OO instanceof C30060Oooo0oO) {
            c30060Oooo0oO = (C30060Oooo0oO) abstractC32479OooO0OO;
            int i = c30060Oooo0oO.f106934OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30060Oooo0oO.f106934OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c30060Oooo0oO = new C30060Oooo0oO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = c30060Oooo0oO.f106933OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c30060Oooo0oO.f106934OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            c30060Oooo0oO.f106931OooOo0o = this;
            c30060Oooo0oO.f106930OooOo = str;
            c30060Oooo0oO.f106934OooOoOO = 1;
            objOooO0Oo = this.f77124OooO0oO.OooO0Oo(str, c30060Oooo0oO);
            if (objOooO0Oo != enumC32485OooO00o) {
                oooO0OO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c30060Oooo0oO.f106930OooOo;
            oooO0OO2 = c30060Oooo0oO.f106931OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            oooO0OO2.f77138OooOo00.OooO0O0(str);
            return C32460OooOooO.f116667OooO00o;
        }
        str = c30060Oooo0oO.f106930OooOo;
        oooO0OO = c30060Oooo0oO.f106931OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0Oo);
        Folder folder = (Folder) objOooO0Oo;
        if (folder != null) {
            C27600o0ooOO0 c27600o0ooOO0 = oooO0OO.f77124OooO0oO;
            c30060Oooo0oO.f106931OooOo0o = oooO0OO;
            c30060Oooo0oO.f106930OooOo = str;
            c30060Oooo0oO.f106934OooOoOO = 2;
            if (c27600o0ooOO0.OooOOO0(folder, true, c30060Oooo0oO) != enumC32485OooO00o) {
                oooO0OO2 = oooO0OO;
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                oooO0OO2.f77138OooOo00.OooO0O0(str);
            }
            return enumC32485OooO00o;
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0O(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C30061Oooo0oo c30061Oooo0oo;
        OooO0OO oooO0OO;
        OooO0OO oooO0OO2;
        if (abstractC32479OooO0OO instanceof C30061Oooo0oo) {
            c30061Oooo0oo = (C30061Oooo0oo) abstractC32479OooO0OO;
            int i = c30061Oooo0oo.f106939OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30061Oooo0oo.f106939OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c30061Oooo0oo = new C30061Oooo0oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOoOO = c30061Oooo0oo.f106938OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c30061Oooo0oo.f106939OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOoOO);
            c30061Oooo0oo.f106936OooOo0o = this;
            c30061Oooo0oo.f106935OooOo = str;
            c30061Oooo0oo.f106939OooOoOO = 1;
            objOooOoOO = this.f77121OooO0Oo.OooOoOO(str, c30061Oooo0oo);
            if (objOooOoOO != enumC32485OooO00o) {
                oooO0OO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c30061Oooo0oo.f106935OooOo;
            oooO0OO2 = c30061Oooo0oo.f106936OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOoOO);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C30053Oooo(oooO0OO2, str, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
        str = c30061Oooo0oo.f106935OooOo;
        oooO0OO = c30061Oooo0oo.f106936OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOoOO);
        NoteMeta noteMeta = (NoteMeta) objOooOoOO;
        if (noteMeta != null) {
            C27449o00O0OoO c27449o00O0OoO = oooO0OO.f77121OooO0Oo;
            c30061Oooo0oo.f106936OooOo0o = oooO0OO;
            c30061Oooo0oo.f106935OooOo = str;
            c30061Oooo0oo.f106939OooOoOO = 2;
            c27449o00O0OoO.getClass();
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27496o00OoOoO(noteMeta, true, c27449o00O0OoO, null), c30061Oooo0oo);
            if (objOooO0o != enumC32485OooO00o) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o != enumC32485OooO00o) {
                oooO0OO2 = oooO0OO;
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C30053Oooo(oooO0OO2, str, null), 3);
            }
            return enumC32485OooO00o;
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30064OoooO00 c30064OoooO00;
        OooO0OO oooO0OO;
        HashSet hashSet;
        Iterator it;
        Iterator it2;
        OooO0OO oooO0OO2;
        if (abstractC32479OooO0OO instanceof C30064OoooO00) {
            c30064OoooO00 = (C30064OoooO00) abstractC32479OooO0OO;
            int i = c30064OoooO00.f106950OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30064OoooO00.f106950OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c30064OoooO00 = new C30064OoooO00(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c30064OoooO00.f106947OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c30064OoooO00.f106950OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            HashSet hashSet2 = (HashSet) this.f77163OoooOO0.getValue();
            oooO0OO = this;
            hashSet = (HashSet) this.f77175o000oOoO.getValue();
            it = hashSet2.iterator();
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it2 = (Iterator) c30064OoooO00.f106945OooOo;
                oooO0OO2 = c30064OoooO00.f106946OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    c30064OoooO00.f106946OooOo0o = oooO0OO2;
                    c30064OoooO00.f106945OooOo = it2;
                    c30064OoooO00.f106948OooOoO0 = null;
                    c30064OoooO00.f106950OooOoo0 = 2;
                    if (oooO0OO2.OooOO0(str, c30064OoooO00) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
            it = c30064OoooO00.f106948OooOoO0;
            hashSet = (HashSet) c30064OoooO00.f106945OooOo;
            oooO0OO = c30064OoooO00.f106946OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        while (it.hasNext()) {
            String str2 = (String) it.next();
            c30064OoooO00.f106946OooOo0o = oooO0OO;
            c30064OoooO00.f106945OooOo = hashSet;
            c30064OoooO00.f106948OooOoO0 = it;
            c30064OoooO00.f106950OooOoo0 = 1;
            if (oooO0OO.OooOO0O(str2, c30064OoooO00) == enumC32485OooO00o) {
                break;
            }
        }
        it2 = hashSet.iterator();
        oooO0OO2 = oooO0OO;
        while (it2.hasNext()) {
        }
        return C32460OooOooO.f116667OooO00o;
    }

    public final void OooOOO(Uri uri) {
        OooOOO0.OooO0oO(uri, "uri");
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30066OoooOO0(this, uri, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OooO0o OooOOO0() {
        NoteVO noteVO = (NoteVO) ((C32443OooOOO) this.f77161OoooO00.getValue()).f116638OooOo0o;
        String id = noteVO != null ? noteVO.getId() : null;
        OooO0o oooO0o = (OooO0o) this.f77143OooOoOO.get(id);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("NoteListViewModel");
        c20358OooO00o.OooO00o("ScrollPos: returning " + oooO0o + " for folder: " + id, new Object[0]);
        return oooO0o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r7.OooO00o(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOOO(Uri uri, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30068OoooOOo c30068OoooOOo;
        OooO0OO oooO0OO;
        if (abstractC32479OooO0OO instanceof C30068OoooOOo) {
            c30068OoooOOo = (C30068OoooOOo) abstractC32479OooO0OO;
            int i = c30068OoooOOo.f106961OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30068OoooOOo.f106961OooOoO = i - Integer.MIN_VALUE;
            } else {
                c30068OoooOOo = new C30068OoooOOo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c30068OoooOOo.f106959OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c30068OoooOOo.f106961OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C30069OoooOo0 c30069OoooOo0 = new C30069OoooOo0(this, uri, null);
            c30068OoooOOo.f106960OooOo0o = this;
            c30068OoooOOo.f106961OooOoO = 1;
            if (C33609OooO0oo.OooO0o(executorC33873OooO0O0, c30069OoooOo0, c30068OoooOOo) != enumC32485OooO00o) {
                oooO0OO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        oooO0OO = c30068OoooOOo.f106960OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        o0000OOO o0000ooo = oooO0OO.f77133OooOOo;
        c30068OoooOOo.f106960OooOo0o = null;
        c30068OoooOOo.f106961OooOoO = 2;
    }

    public final void OooOOOo(List<? extends Uri> uriList) {
        OooOOO0.OooO0oO(uriList, "uriList");
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C23633OooO0oO(uriList, null), 2);
    }

    public final Object OooOOo(List list, AbstractC32476OooO abstractC32476OooO) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30073Ooooo0o(this, list, null), abstractC32476OooO);
    }

    public final Object OooOOo0(List list, String str, AbstractC32476OooO abstractC32476OooO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30072Ooooo00(this, list, str, null), abstractC32476OooO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    public final Object OooOOoo(int i, String str, NoteVO noteVO, AbstractC32476OooO abstractC32476OooO) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30074OooooO0(str, noteVO, i, this, null), abstractC32476OooO);
    }

    public final void OooOo(int i, String id) {
        OooOOO0.OooO0oO(id, "id");
        C33781o00o0O c33781o00o0O = this.f77163OoooOO0;
        if (i != 0 && i == 1) {
            c33781o00o0O = this.f77175o000oOoO;
        }
        HashSet hashSet = new HashSet((HashSet) c33781o00o0O.getValue());
        if (hashSet.contains(id)) {
            hashSet.remove(id);
        } else {
            hashSet.add(id);
        }
        c33781o00o0O.OooOO0(null, hashSet);
    }

    public final Object OooOo0(NoteVO noteVO, AbstractC32476OooO abstractC32476OooO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0o00oOo.o0OoOo0(this, noteVO, null), abstractC32476OooO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    public final C32460OooOooO OooOo00(Bundle bundle, String str) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C30078Oooooo0(this, str, bundle, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }

    public final Object OooOo0O(String str, int i, String str2, Continuation continuation) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C23634OooO0oo(i, this, str, str2, null), continuation);
    }

    public final void OooOo0o(List<NoteVO> list) {
        Set setO0OO00O;
        OooOOO0.OooO0oO(list, "list");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("NoteListViewModel");
        c20358OooO00o.OooO0o0("selectAll", new Object[0]);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Integer numValueOf = Integer.valueOf(((NoteVO) obj).getType());
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        Map mapOooOOO0 = C34444Oooo0O0.OooOOO0(linkedHashMap);
        List list2 = (List) mapOooOOO0.get(0);
        Set setO0OO00O2 = C34438OooOoo0.f123458OooOo0o;
        if (list2 != null) {
            List list3 = list2;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList2.add(((NoteVO) it.next()).getId());
            }
            setO0OO00O = OooOo.o0OO00O(arrayList2);
        } else {
            setO0OO00O = setO0OO00O2;
        }
        List list4 = (List) mapOooOOO0.get(1);
        if (list4 != null) {
            List list5 = list4;
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list5, 10));
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((NoteVO) it2.next()).getId());
            }
            setO0OO00O2 = OooOo.o0OO00O(arrayList3);
        }
        HashSet hashSet = new HashSet(setO0OO00O);
        C33781o00o0O c33781o00o0O = this.f77163OoooOO0;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, hashSet);
        HashSet hashSet2 = new HashSet(setO0OO00O2);
        C33781o00o0O c33781o00o0O2 = this.f77175o000oOoO;
        c33781o00o0O2.getClass();
        c33781o00o0O2.OooOO0(null, hashSet2);
    }

    public final Object OooOoO(String str, AbstractC32476OooO abstractC32476OooO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30092ooOO(this, str, null), abstractC32476OooO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    public final Object OooOoO0(NoteVO noteVO, Continuation<? super C32460OooOooO> continuation) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooO(this, noteVO, null), continuation);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    public final void OooOoOO(int i) {
        Integer numValueOf = Integer.valueOf(i);
        C33781o00o0O c33781o00o0O = this.f77142OooOoO0;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, numValueOf);
    }

    public final void OooOoo(Integer num) {
        this.f77157Oooo0oO.setValue(num);
        if (num == null) {
            return;
        }
        C33781o00o0O c33781o00o0O = this.f77156Oooo0o0;
        Iterable<C31049OooOo0> iterable = (Iterable) c33781o00o0O.getValue();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        for (C31049OooOo0 c31049OooOo0 : iterable) {
            arrayList.add(new C31049OooOo0(c31049OooOo0.f110853OooO00o, c31049OooOo0.f110853OooO00o == num.intValue()));
        }
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, arrayList);
        C33781o00o0O c33781o00o0O2 = this.f77142OooOoO0;
        c33781o00o0O2.getClass();
        c33781o00o0O2.OooOO0(null, num);
    }

    public final Object OooOoo0(String str, int i, AbstractC32476OooO abstractC32476OooO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0o00oOo.o00O0O(this, str, i, null), abstractC32476OooO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    public final void OooOooO(int i) {
        C33781o00o0O c33781o00o0O = this.f77139OooOo0O;
        List list = (List) c33781o00o0O.getValue();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i2 = ((C31040OooOO0o) it.next()).f110821OooO00o;
            arrayList.add(i2 == i ? new C31040OooOO0o(i, true) : new C31040OooOO0o(i2, false));
        }
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, arrayList);
        Integer numValueOf = Integer.valueOf(i);
        C33781o00o0O c33781o00o0O2 = this.f77136OooOo;
        c33781o00o0O2.getClass();
        c33781o00o0O2.OooOO0(null, numValueOf);
    }

    public final void OooOooo(com.orion.notein.p607ui.p609vo.OooO00o key) {
        OooOOO0.OooO0oO(key, "key");
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooOO0(key, null), 2);
    }

    public final void Oooo0(boolean z) {
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooOO0O(z, null), 2);
    }

    public final void Oooo000(int i) {
        if (i == 0) {
            HashSet hashSet = new HashSet();
            C33781o00o0O c33781o00o0O = this.f77163OoooOO0;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, hashSet);
            HashSet hashSet2 = new HashSet();
            C33781o00o0O c33781o00o0O2 = this.f77175o000oOoO;
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, hashSet2);
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("NoteListViewModel");
        C33781o00o0O c33781o00o0O3 = this.f77146OooOooO;
        c20358OooO00o.OooO0o0("old state: " + c33781o00o0O3.getValue() + ", new state: " + i, new Object[0]);
        Integer numValueOf = Integer.valueOf(i);
        c33781o00o0O3.getClass();
        c33781o00o0O3.OooOO0(null, numValueOf);
    }

    public final void Oooo00O(String str) {
        C33781o00o0O c33781o00o0O = this.f77151Oooo00O;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        if (r7.OoooOOO(r10, r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo00o(NoteVO noteVO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o0o00oOo.o00000O o00000o;
        OooO0OO oooO0OO;
        OooO0OO oooO0OO2;
        Folder folder;
        OooO0OO oooO0OO3;
        Folder folder2;
        if (abstractC32479OooO0OO instanceof o0o00oOo.o00000O) {
            o00000o = (o0o00oOo.o00000O) abstractC32479OooO0OO;
            int i = o00000o.f107044OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00000o.f107044OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o00000o = new o0o00oOo.o00000O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOoOO = o00000o.f107043OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00000o.f107044OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOoOO);
            if (noteVO.getType() != 0) {
                oooO0OO = this;
                if (noteVO.getType() == 1) {
                }
                return C32460OooOooO.f116667OooO00o;
            }
            String id = noteVO.getId();
            o00000o.f107041OooOo0o = this;
            o00000o.f107040OooOo = noteVO;
            o00000o.f107044OooOoOO = 1;
            objOooOoOO = this.f77121OooO0Oo.OooOoOO(id, o00000o);
            if (objOooOoOO != enumC32485OooO00o) {
                oooO0OO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                noteVO = (NoteVO) o00000o.f107040OooOo;
                oooO0OO = o00000o.f107041OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOoOO);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                oooO0OO.f77138OooOo00.OooO0Oo(noteVO.getId(), true);
                if (noteVO.getType() == 1) {
                    C27600o0ooOO0 c27600o0ooOO0 = oooO0OO.f77124OooO0oO;
                    String id2 = noteVO.getId();
                    o00000o.f107041OooOo0o = oooO0OO;
                    o00000o.f107040OooOo = null;
                    o00000o.f107044OooOoOO = 3;
                    objOooOoOO = c27600o0ooOO0.OooO0Oo(id2, o00000o);
                    if (objOooOoOO != enumC32485OooO00o) {
                        oooO0OO2 = oooO0OO;
                        folder = (Folder) objOooOoOO;
                        if (folder != null) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                return C32460OooOooO.f116667OooO00o;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                folder2 = (Folder) o00000o.f107040OooOo;
                oooO0OO3 = o00000o.f107041OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOoOO);
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                oooO0OO3.f77138OooOo00.OooO0O0(folder2.getId());
                return C32460OooOooO.f116667OooO00o;
            }
            oooO0OO2 = o00000o.f107041OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOoOO);
            folder = (Folder) objOooOoOO;
            if (folder != null) {
                C27600o0ooOO0 c27600o0ooOO02 = oooO0OO2.f77124OooO0oO;
                o00000o.f107041OooOo0o = oooO0OO2;
                o00000o.f107040OooOo = folder;
                o00000o.f107044OooOoOO = 4;
                if (c27600o0ooOO02.OooOOO(folder, o00000o) != enumC32485OooO00o) {
                    oooO0OO3 = oooO0OO2;
                    folder2 = folder;
                    C32460OooOooO c32460OooOooO22 = C32460OooOooO.f116667OooO00o;
                    oooO0OO3.f77138OooOo00.OooO0O0(folder2.getId());
                }
                return enumC32485OooO00o;
            }
            return C32460OooOooO.f116667OooO00o;
        }
        noteVO = (NoteVO) o00000o.f107040OooOo;
        oooO0OO = o00000o.f107041OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOoOO);
        NoteMeta noteMeta = (NoteMeta) objOooOoOO;
        if (noteMeta == null) {
            if (noteVO.getType() == 1) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
        C27449o00O0OoO c27449o00O0OoO = oooO0OO.f77121OooO0Oo;
        o00000o.f107041OooOo0o = oooO0OO;
        o00000o.f107040OooOo = noteVO;
        o00000o.f107044OooOoOO = 2;
        return enumC32485OooO00o;
    }

    public final void Oooo0O0() {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("NoteListViewModel");
        c20358OooO00o.OooO0o0("unSelectNotesAndFolders", new Object[0]);
        HashSet hashSet = new HashSet();
        C33781o00o0O c33781o00o0O = this.f77163OoooOO0;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, hashSet);
        HashSet hashSet2 = new HashSet();
        C33781o00o0O c33781o00o0O2 = this.f77175o000oOoO;
        c33781o00o0O2.getClass();
        c33781o00o0O2.OooOO0(null, hashSet2);
    }

    public final void Oooo0OO(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new o0o00oOo.o00000OO(this, linkedHashMap, linkedHashMap2, null), 2);
    }
}
