package com.orion.notein.p607ui.noteeditor.propertypanel.preview;

import OooO0o.C20424OooO0Oo;
import OooOOO.OooO0O0;
import OooOoo0.C20703o000000o;
import android.content.Context;
import android.graphics.RectF;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.C21976OooOO0o;
import androidx.lifecycle.C21995Oooo0O0;
import androidx.lifecycle.Oooo0;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.App;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o000oo0.C24660OooO0o0;
import o000oo0.C24670OooOOo0;
import o000oo0.C24681OooOoo0;
import o00O0O0o.C24841OooOOo0;
import o00O0OO0.OooOO0O;
import o00O0OoO.C24880OooOOoo;
import o00O0OoO.C24890OooOooo;
import o00O0OoO.CallableC24881OooOo0;
import o00O0Ooo.C24893OooO;
import o00o00O0.C25252OooO0Oo;
import o00oOOo.C25591OooO0O0;
import o0OO00o0.C26577o000oo0O;
import o0OO0ooO.C26958OooO0o0;
import o0OOo0Oo.InterfaceC27306OooOo00;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27456o00O0o0O;
import o0OOo0o.C27459o00O0oOO;
import o0OOo0o.C27545o00o0oo0;
import o0OOo0o.C27585o00ooO0;
import o0OOo0oo.o0ooOOo;
import o0OOoOo0.C27819OooOoo;
import o0Ooooo.C29674OooOOO;
import o0Ooooo.C29676OooOOOO;
import o0Ooooo.C29679OooOOo0;
import o0Ooooo.C29680OooOOoo;
import o0Ooooo.C29681OooOo;
import o0Ooooo.C29682OooOo0;
import o0Ooooo.C29683OooOo00;
import o0Ooooo.C29684OooOo0O;
import o0Ooooo.C29685OooOo0o;
import o0Ooooo.C29686OooOoO;
import o0Ooooo.C29687OooOoO0;
import o0Ooooo.C29688OooOoOO;
import o0Ooooo.C29690OooOoo0;
import o0Ooooo.C29691OooOooO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33779o00Oo0;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0OoO.C33799OooOO0O;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/propertypanel/preview/OooO0OO;", "Landroidx/lifecycle/Ooooooo;", "OooO00o", "OooO0O0", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class OooO0OO extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C27819OooOoo f76065OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27449o00O0OoO f76066OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0ooOOo f76067OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27545o00o0oo0 f76068OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C27585o00ooO0 f76069OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final InterfaceC27306OooOo00 f76070OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final InterfaceC33721OooO0o<List<C24841OooOOo0>> f76071OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o00000OO f76072OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C33781o00o0O f76073OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C33769Ooooo0o f76074OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C33781o00o0O f76075OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final C33769Ooooo0o f76076OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C33769Ooooo0o f76077OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final C33769Ooooo0o f76078OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final C26958OooO0o0 f76079OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final C33769Ooooo0o f76080OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33781o00o0O f76081OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final C33763OoooOOO f76082OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final InterfaceC33721OooO0o<String> f76083OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final C33781o00o0O f76084OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C33781o00o0O f76085OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C33769Ooooo0o f76086OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C27459o00O0oOO f76087OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C33769Ooooo0o f76088OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C33781o00o0O f76089OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C33769Ooooo0o f76090OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C33769Ooooo0o f76091OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C33769Ooooo0o f76092OooOooo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f76093OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f76094OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f76095OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f76096OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final RectF f76097OooO0o0;

        public OooO00o(String noteId, String pageId, String str, long j, RectF rectF) {
            OooOOO0.OooO0oO(noteId, "noteId");
            OooOOO0.OooO0oO(pageId, "pageId");
            this.f76093OooO00o = noteId;
            this.f76094OooO0O0 = pageId;
            this.f76095OooO0OO = str;
            this.f76096OooO0Oo = j;
            this.f76097OooO0o0 = rectF;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return OooOOO0.OooO0O0(this.f76093OooO00o, oooO00o.f76093OooO00o) && OooOOO0.OooO0O0(this.f76094OooO0O0, oooO00o.f76094OooO0O0) && OooOOO0.OooO0O0(this.f76095OooO0OO, oooO00o.f76095OooO0OO) && this.f76096OooO0Oo == oooO00o.f76096OooO0Oo && OooOOO0.OooO0O0(this.f76097OooO0o0, oooO00o.f76097OooO0o0);
        }

        public final int hashCode() {
            return this.f76097OooO0o0.hashCode() + C20703o000000o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f76093OooO00o.hashCode() * 31, 31, this.f76094OooO0O0), 31, this.f76095OooO0OO), 31, this.f76096OooO0Oo);
        }

        public final String toString() {
            return "NavTnInfo(noteId=" + this.f76093OooO00o + ", pageId=" + this.f76094OooO0O0 + ", tnFilePath=" + this.f76095OooO0OO + ", tnFileLastModified=" + this.f76096OooO0Oo + ", pageBounds=" + this.f76097OooO0o0 + ")";
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final PagePreviewVO f76098OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f76099OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f76100OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final RectF f76101OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final RectF f76102OooO0o0;

        public OooO0O0(PagePreviewVO pagePreviewVO, String str, long j, RectF rectF, RectF visibleBounds) {
            OooOOO0.OooO0oO(visibleBounds, "visibleBounds");
            this.f76098OooO00o = pagePreviewVO;
            this.f76099OooO0O0 = str;
            this.f76100OooO0OO = j;
            this.f76101OooO0Oo = rectF;
            this.f76102OooO0o0 = visibleBounds;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return OooOOO0.OooO0O0(this.f76098OooO00o, oooO0O0.f76098OooO00o) && OooOOO0.OooO0O0(this.f76099OooO0O0, oooO0O0.f76099OooO0O0) && this.f76100OooO0OO == oooO0O0.f76100OooO0OO && OooOOO0.OooO0O0(this.f76101OooO0Oo, oooO0O0.f76101OooO0Oo) && OooOOO0.OooO0O0(this.f76102OooO0o0, oooO0O0.f76102OooO0o0);
        }

        public final int hashCode() {
            return this.f76102OooO0o0.hashCode() + C20424OooO0Oo.OooO0OO(this.f76101OooO0Oo, C20703o000000o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f76098OooO00o.hashCode() * 31, 31, this.f76099OooO0O0), 31, this.f76100OooO0OO), 31);
        }

        public final String toString() {
            return "TnNavigatorInfo(vo=" + this.f76098OooO00o + ", tnFilePath=" + this.f76099OooO0O0 + ", tnFileLastModified=" + this.f76100OooO0OO + ", pageBounds=" + this.f76101OooO0Oo + ", visibleBounds=" + this.f76102OooO0o0 + ")";
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.OooO0OO$OooO0OO, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewViewModel", m80623f = "EditorPreviewViewModel.kt", m80624l = {394, 396}, m80625m = "rename")
    public static final class C19373OooO0OO extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public String f76103OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public OooO0OO f76104OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public /* synthetic */ Object f76105OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public String f76106OooOoO0;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f76108OooOoo0;

        public C19373OooO0OO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
            super(abstractC32479OooO0OO);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f76105OooOoO = obj;
            this.f76108OooOoo0 |= Integer.MIN_VALUE;
            return OooO0OO.this.OooO0o0(null, 0, null, this);
        }
    }

    public OooO0OO(C26577o000oo0O c26577o000oo0O, C27449o00O0OoO c27449o00O0OoO, C27545o00o0oo0 c27545o00o0oo0, o0ooOOo o0ooooo2, C27585o00ooO0 c27585o00ooO0, InterfaceC27306OooOo00 labelRepo, C27819OooOoo c27819OooOoo, Context context) {
        C21995Oooo0O0.OooO00o<?> oooO00o;
        OooOOO0.OooO0oO(labelRepo, "labelRepo");
        this.f76066OooO0Oo = c27449o00O0OoO;
        this.f76068OooO0o0 = c27545o00o0oo0;
        this.f76067OooO0o = o0ooooo2;
        this.f76069OooO0oO = c27585o00ooO0;
        this.f76070OooO0oo = labelRepo;
        this.f76065OooO = c27819OooOoo;
        OooOO0O oooOO0OOoooooO = OooOO0O.OoooooO(context);
        C24890OooOooo c24890OooOooo = (C24890OooOooo) oooOO0OOoooooO.f84362OooO0OO.OooOoO();
        c24890OooOooo.getClass();
        C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(1, "SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        c24681OooOoo0OooOOO0.OoooOO0(1, "PageTextCacheUpdateWorker");
        androidx.room.OooO0OO oooO0OOOooOO0 = c24890OooOooo.f84485OooO00o.OooOO0();
        String[] strArr = {"WorkTag", "WorkProgress", "workspec", "workname"};
        CallableC24881OooOo0 callableC24881OooOo0 = new CallableC24881OooOo0(c24890OooOooo, c24681OooOoo0OooOOO0);
        oooO0OOOooOO0.f66184OooO0OO.OooO0oO(strArr);
        C24660OooO0o0 c24660OooO0o0 = oooO0OOOooOO0.f66189OooO0oo;
        c24660OooO0o0.getClass();
        C24670OooOOo0 c24670OooOOo0 = new C24670OooOOo0(c24660OooO0o0.f83540OooO00o, c24660OooO0o0, strArr, callableC24881OooOo0);
        C24880OooOOoo.OooO00o oooO00o2 = C24880OooOOoo.f84455OooOo00;
        C25591OooO0O0 c25591OooO0O0 = oooOO0OOoooooO.f84363OooO0Oo;
        Object obj = new Object();
        C21995Oooo0O0 c21995Oooo0O0 = new C21995Oooo0O0();
        C24893OooO c24893OooO = new C24893OooO(c25591OooO0O0, obj, oooO00o2, c21995Oooo0O0);
        C21995Oooo0O0.OooO00o oooO00o3 = new C21995Oooo0O0.OooO00o(c24670OooOOo0, c24893OooO);
        OooOOO.OooO0O0<Oooo0<?>, C21995Oooo0O0.OooO00o<?>> oooO0O0 = c21995Oooo0O0.f65593OooOO0o;
        OooO0O0.OooO0OO<Oooo0<?>, C21995Oooo0O0.OooO00o<?>> oooO0OOOooO0O0 = oooO0O0.OooO0O0(c24670OooOOo0);
        if (oooO0OOOooO0O0 != null) {
            oooO00o = oooO0OOOooO0O0.f58395OooOo;
        } else {
            OooO0O0.OooO0OO<K, V> oooO0OO = new OooO0O0.OooO0OO<>(c24670OooOOo0, oooO00o3);
            oooO0O0.f58393OooOoO++;
            OooO0O0.OooO0OO oooO0OO2 = oooO0O0.f58391OooOo;
            if (oooO0OO2 == null) {
                oooO0O0.f58392OooOo0o = oooO0OO;
                oooO0O0.f58391OooOo = oooO0OO;
            } else {
                oooO0OO2.f58398OooOoO0 = oooO0OO;
                oooO0OO.f58397OooOoO = oooO0OO2;
                oooO0O0.f58391OooOo = oooO0OO;
            }
            oooO00o = null;
        }
        C21995Oooo0O0.OooO00o<?> oooO00o4 = oooO00o;
        if (oooO00o4 != null && oooO00o4.f65594OooOo != c24893OooO) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (oooO00o4 == null && c21995Oooo0O0.f65576OooO0OO > 0) {
            c24670OooOOo0.OooO0o0(oooO00o3);
        }
        InterfaceC33721OooO0o<List<C24841OooOOo0>> interfaceC33721OooO0oOooO0Oo = C25252OooO0Oo.OooO0Oo(C25252OooO0Oo.OooO0o0(new C21976OooOO0o(c21995Oooo0O0, null)), -1);
        this.f76071OooOO0 = interfaceC33721OooO0oOooO0Oo;
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o("");
        this.f76073OooOO0o = c33781o00o0OOooO00o;
        this.f76075OooOOO0 = c33781o00o0OOooO00o;
        C33769Ooooo0o c33769Ooooo0oOooOoO0 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(c33781o00o0OOooO00o, new C29685OooOo0o(this, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), new NoteMeta(null, null, null, null, null, false, null, 0, 0, false, null, 0, 0L, 0L, null, false, false, false, 0L, 524287, null));
        C33799OooOO0O c33799OooOO0OOooOoO = C25252OooO0Oo.OooOoO(c33781o00o0OOooO00o, new C29681OooOo(this, null));
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33779o00Oo0 c33779o00Oo0OooO00o = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        this.f76074OooOOO = C25252OooO0Oo.OooOoO0(c33799OooOO0OOooOoO, interfaceC33636Oooo00oOooO00o, c33779o00Oo0OooO00o, c34434OooOoO);
        C33769Ooooo0o c33769Ooooo0oOooOoO02 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(c33781o00o0OOooO00o, new C29687OooOoO0(this, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), new NoteContent(null, null, null, null, null, null, 0, null, 0.0f, 0.0f, 0.0f, false, 0L, 0L, null, 32767, null));
        this.f76076OooOOOO = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOo(new C29676OooOOOO(2, null), c33769Ooooo0oOooOoO02), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), 0);
        C33799OooOO0O c33799OooOO0OOooOoO2 = C25252OooO0Oo.OooOoO(c33769Ooooo0oOooOoO02, new C29686OooOoO(this, null));
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = o0OoOo0.OooO00o(this);
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        C33769Ooooo0o c33769Ooooo0oOooOoO03 = C25252OooO0Oo.OooOoO0(c33799OooOO0OOooOoO2, C33633Oooo0.OooO0oO(interfaceC33636Oooo00oOooO00o2, executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f76077OooOOOo = c33769Ooooo0oOooOoO03;
        C33769Ooooo0o c33769Ooooo0oOooOoO04 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(new C33763OoooOOO(c33769Ooooo0oOooOoO03, c33769Ooooo0oOooOoO02, new C29680OooOOoo(this, null)), new C29688OooOoOO(3, null)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), C34436OooOoOO.f123455OooOo0o);
        C33784o00ooo.OooO00o(0);
        this.f76079OooOOo0 = new C26958OooO0o0(c33769Ooooo0oOooOoO02, 1);
        this.f76078OooOOo = C25252OooO0Oo.OooOoO0(new C29691OooOooO(c33769Ooooo0oOooOoO0), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), "");
        this.f76080OooOOoo = C25252OooO0Oo.OooOoO0(new C27456o00O0o0O(c33769Ooooo0oOooOoO02, 1), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), -1);
        InterfaceC33721OooO0o<String> interfaceC33721OooO0oOooOo0O = C25252OooO0Oo.OooOo0O(c26577o000oo0O.OooO0O0(App.f69576o00000), executorC33873OooO0O0);
        this.f76083OooOo00 = interfaceC33721OooO0oOooOo0O;
        this.f76082OooOo0 = new C33763OoooOOO(c33769Ooooo0oOooOoO02, interfaceC33721OooO0oOooOo0O, new C29674OooOOO(3, null));
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o(0);
        this.f76084OooOo0O = c33781o00o0OOooO00o2;
        this.f76085OooOo0o = c33781o00o0OOooO00o2;
        C33781o00o0O c33781o00o0OOooO00o3 = C33784o00ooo.OooO00o("");
        this.f76081OooOo = c33781o00o0OOooO00o3;
        this.f76087OooOoO0 = new C27459o00O0oOO(c33781o00o0OOooO00o3, 1);
        C33769Ooooo0o c33769Ooooo0oOooOoO05 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(c33781o00o0OOooO00o3, new C29690OooOoo0(this, null)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f76086OooOoO = C25252OooO0Oo.OooOoO0(c33769Ooooo0oOooOoO05, o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        C33763OoooOOO c33763OoooOOO = new C33763OoooOOO(c33769Ooooo0oOooOoO02, c33781o00o0OOooO00o2, new C29679OooOOo0(3, null));
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o3 = o0OoOo0.OooO00o(this);
        C33779o00Oo0 c33779o00Oo0OooO00o2 = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        Boolean bool = Boolean.FALSE;
        C33769Ooooo0o c33769Ooooo0oOooOoO06 = C25252OooO0Oo.OooOoO0(c33763OoooOOO, interfaceC33636Oooo00oOooO00o3, c33779o00Oo0OooO00o2, bool);
        this.f76088OooOoOO = c33769Ooooo0oOooOoO06;
        C33769Ooooo0o c33769Ooooo0oOooOoO07 = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33769Ooooo0oOooOoO03, c33769Ooooo0oOooOoO06, new C23555OooO0Oo(this, null)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        C33769Ooooo0o c33769Ooooo0oOooOoO08 = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(C25252OooO0Oo.OooO(c33769Ooooo0oOooOoO03, c33769Ooooo0oOooOoO02, c33781o00o0OOooO00o3, c33769Ooooo0oOooOoO05, new C29683OooOo00(5, null)), c33769Ooooo0oOooOoO04, new C29682OooOo0(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f76090OooOoo0 = c33769Ooooo0oOooOoO08;
        C33781o00o0O c33781o00o0OOooO00o4 = C33784o00ooo.OooO00o(new C32443OooOOO("", new RectF()));
        this.f76089OooOoo = c33781o00o0OOooO00o4;
        this.f76091OooOooO = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooO0oo(c33769Ooooo0oOooOoO08, c33769Ooooo0oOooOoO07, c33781o00o0OOooO00o4, new C23556OooO0o0(4, null)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f76092OooOooo = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(interfaceC33721OooO0oOooO0Oo, c33781o00o0OOooO00o2, new C29684OooOo0O(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool);
    }

    @Override // androidx.lifecycle.AbstractC22019Ooooooo
    public final void OooO0OO() {
        o00000OO o00000oo2 = this.f76072OooOO0O;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (r2.Oooo0oo(r10, r9, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, int i, String str2, Continuation continuation) {
        C19373OooO0OO c19373OooO0OO;
        OooO0OO oooO0OO;
        if (continuation instanceof C19373OooO0OO) {
            c19373OooO0OO = (C19373OooO0OO) continuation;
            int i2 = c19373OooO0OO.f76108OooOoo0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c19373OooO0OO.f76108OooOoo0 = i2 - Integer.MIN_VALUE;
            } else {
                c19373OooO0OO = new C19373OooO0OO((AbstractC32479OooO0OO) continuation);
            }
        }
        Object objOooOoOO = c19373OooO0OO.f76105OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c19373OooO0OO.f76108OooOoo0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooOoOO);
            if (i == 0) {
                c19373OooO0OO.f76104OooOo0o = this;
                c19373OooO0OO.f76103OooOo = str;
                c19373OooO0OO.f76106OooOoO0 = str2;
                c19373OooO0OO.f76108OooOoo0 = 1;
                objOooOoOO = this.f76066OooO0Oo.OooOoOO(str, c19373OooO0OO);
                if (objOooOoOO != enumC32485OooO00o) {
                    oooO0OO = this;
                }
                return enumC32485OooO00o;
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c19373OooO0OO.f76103OooOo;
            oooO0OO = c19373OooO0OO.f76104OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOoOO);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            oooO0OO.f76067OooO0o.OooO0Oo(str, true);
            return C32460OooOooO.f116667OooO00o;
        }
        str2 = c19373OooO0OO.f76106OooOoO0;
        str = c19373OooO0OO.f76103OooOo;
        oooO0OO = c19373OooO0OO.f76104OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOoOO);
        NoteMeta noteMeta = (NoteMeta) objOooOoOO;
        if (noteMeta != null) {
            C27449o00O0OoO c27449o00O0OoO = oooO0OO.f76066OooO0Oo;
            c19373OooO0OO.f76104OooOo0o = oooO0OO;
            c19373OooO0OO.f76103OooOo = str;
            c19373OooO0OO.f76106OooOoO0 = null;
            c19373OooO0OO.f76108OooOoo0 = 2;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
