package com.orion.notein.p607ui.noteeditor;

import OooOoOO.C20519OooO0Oo;
import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.net.Uri;
import android.os.PersistableBundle;
import android.os.SystemClock;
import androidx.appcompat.app.OooOOO;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.aspose.slides.C22201OooO0oO;
import com.aspose.slides.exceptions.NotImplementedException;
import com.google.gson.Gson;
import com.orion.notein.App;
import com.orion.notein.domain.models.DragConstants;
import com.orion.notein.domain.models.cloudsync.CloudMetaType;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.Image;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.TextBox;
import com.orion.notein.domain.models.translate.TranslateResult;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.ImageInfo;
import com.orion.penkit.models.LayerInfo;
import com.orion.penkit.models.ShapeInfo;
import com.orion.penkit.models.TextBoxInfo;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.C24039Oooo0o0;
import kotlin.jvm.internal.OooOOO0;
import o0000o0O.OooOO0;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import o0O0oOoo.C26188OoooOo0;
import o0O0oooO.C26264OooOOO0;
import o0OO00o0.C26515OooooO0;
import o0OO00o0.C26522o000000o;
import o0OO00o0.C26534o0000o0O;
import o0OO00o0.C26539o0000oOo;
import o0OO00o0.C26540o0000oo;
import o0OO00o0.C26543o000O0o;
import o0OO00o0.C26553o000OoO;
import o0OO00o0.C26577o000oo0O;
import o0OO00o0.C26596o00O0o0;
import o0OO00o0.C26649o00OoooO;
import o0OO00o0.C26682o00oO0O;
import o0OO00o0.C26688o0ooOO0;
import o0OO00o0.o000;
import o0OO00o0.o0000O0;
import o0OO00o0.o0000O00;
import o0OO00o0.o0000O0O;
import o0OO00o0.o0000OO;
import o0OO00o0.o0000OO0;
import o0OO00o0.o000OO;
import o0OO00o0.o000Oo0;
import o0OO00o0.o0O0O00;
import o0OOO0OO.C27020OooOoO0;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0Oo.InterfaceC27301OooOOo;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0Oo.InterfaceC27323Oooo0oO;
import o0OOo0o.C27428o000oOoO;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27515o00o0000;
import o0OOo0o.C27545o00o0oo0;
import o0OOo0o.C27585o00ooO0;
import o0OOo0o.C27597o00ooo00;
import o0OOo0o.C27602oOooo0o;
import o0OOo0o.o00000O;
import o0OOo0oo.o0ooOOo;
import o0OOoO.C27710OooO0oo;
import o0OOoo0o.C27869OooOOO;
import o0OOooO.C27881OooOO0O;
import o0OOooo0.C27994OooOOOO;
import o0Oo00o.C28028OooO0o;
import o0OoO0oo.C28687OooO0OO;
import o0OoO0oo.C28693OooOO0;
import o0OoO0oo.C28889o00OoOOo;
import o0OoO0oo.C28890o00OoOo;
import o0OoO0oo.C28891o00OoOo0;
import o0OoO0oo.C28893o00OoOoo;
import o0OoO0oo.C28896o00Ooo00;
import o0OoO0oo.C28897o00Ooo0O;
import o0OoO0oo.C28898o00Ooo0o;
import o0OoO0oo.C28900o00OooO0;
import o0OoO0oo.C28904o00Ooooo;
import o0OoO0oo.C28906o00o0;
import o0OoO0oo.C28907o00o00;
import o0OoO0oo.C28909o00o0000;
import o0OoO0oo.C28917o00o00oo;
import o0OoO0oo.C28920o00o0O00;
import o0OoO0oo.C28921o00o0O0O;
import o0OoO0oo.C28922o00o0OO;
import o0OoO0oo.C28926o00o0Oo;
import o0OoO0oo.C28927o00o0Oo0;
import o0OoO0oo.C28928o00o0OoO;
import o0OoO0oo.C28935o00o0oO0;
import o0OoO0oo.C28936o00o0oOO;
import o0OoO0oo.C28937o00o0oOo;
import o0OoO0oo.C28941o00oO0;
import o0OoO0oo.C28942o00oO000;
import o0OoO0oo.C28944o00oO00o;
import o0OoO0oo.C28946o00oO0O0;
import o0OoO0oo.C28948o00oOO;
import o0OoO0oo.C28949o00oOOO0;
import o0OoO0oo.C28950o00oOOOO;
import o0OoO0oo.C28951o00oOOOo;
import o0OoO0oo.C28953o00oOOo0;
import o0OoO0oo.C28955o00oOo;
import o0OoO0oo.C28956o00oOo00;
import o0OoO0oo.C28965o00oOooO;
import o0OoO0oo.C28976o0ooOO;
import o0OoO0oo.o0oOOo;
import o0OoO0oo.oo00oO;
import o0Ooo00o.AbstractC29372OooO00o;
import o0Ooo00o.C29373OooO0O0;
import o0oOo0o0.C30982OooO0Oo;
import o0oo000O.C31186OooO0Oo;
import o0oo000O.C31190OooO0oo;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0Oo.C33720OooO0Oo;
import oO0o0Oo.C33759OoooO0;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oO0o0Oo.C33779o00Oo0;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0OoO.C33799OooOO0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;
import oOo00O0O.C34467OooOo0;
import oOo00O0O.OooOo00;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/OooOOo;", "Landroidx/lifecycle/Ooooooo;", "OooO0o0", "OooO0O0", "OooO0OO", "OooO00o", "OooO0Oo", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C23344OooOOo extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C27545o00o0oo0 f73544OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27449o00O0OoO f73545OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C27710OooO0oo f73546OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27869OooOOO f73547OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C27881OooOO0O f73548OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00000O f73549OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C27129OoooOOO f73550OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f73551OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C27020OooOoO0 f73552OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C26264OooOOO0 f73553OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C26596o00O0o0 f73554OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final InterfaceC27323Oooo0oO f73555OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C26577o000oo0O f73556OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final C30982OooO0Oo f73557OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final C27994OooOOOO f73558OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final o0OO0O0O.OooO00o f73559OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C27585o00ooO0 f73560OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final o0OOOO0.OooO0o f73561OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final C26649o00OoooO f73562OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final C26515OooooO0 f73563OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC27301OooOOo f73564OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final o0ooOOo f73565OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C27515o00o0000 f73566OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C32447OooOOo f73567OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C33769Ooooo0o f73568OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public C28693OooOO0 f73569OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final File f73570OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C33769Ooooo0o f73571OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final C33769Ooooo0o f73572Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final C33781o00o0O f73573Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C33769Ooooo0o f73574Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C33769Ooooo0o f73575Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C33769Ooooo0o f73576Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final C33781o00o0O f73577Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final C33781o00o0O f73578Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final C28976o0ooOO f73579Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final C33769Ooooo0o f73580Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final C33769Ooooo0o f73581Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final C33769Ooooo0o f73582Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final C33769Ooooo0o f73583OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final C33781o00o0O f73584OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final C33769Ooooo0o f73585OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final C33781o00o0O f73586OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final C33769Ooooo0o f73587OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final C33781o00o0O f73588OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final C33781o00o0O f73589OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final C33781o00o0O f73590OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final C33781o00o0O f73591OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final C33769Ooooo0o f73592OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final C33769Ooooo0o f73593Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f73594Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final InterfaceC33721OooO0o<Integer> f73595OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final C33769Ooooo0o f73596OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public final C33898OooO0Oo f73597OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public C23346OooO0o0 f73598Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public long f73599Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public o00000OO f73600OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public final C33769Ooooo0o f73601Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final C33781o00o0O f73602o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public final C28949o00oOOO0 f73603o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public final C33781o00o0O f73604o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public final C33769Ooooo0o f73605o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public final C33769Ooooo0o f73606o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public final C33772OooooOo f73607o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public final C33772OooooOo f73608o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public final C33772OooooOo f73609o00ooo;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public final C33781o00o0O f73610o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public final C33898OooO0Oo f73611o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public final C33769Ooooo0o f73612o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public final C33781o00o0O f73613o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public final C33781o00o0O f73614o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public final C33781o00o0O f73615o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public final C33772OooooOo f73616oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public final C33769Ooooo0o f73617ooOO;

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooOOo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO00o f73618OooO0OO = new OooO00o("", new PointF(0.0f, 0.0f));

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f73619OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final PointF f73620OooO0O0;

        public OooO00o(String pageId, PointF pointF) {
            OooOOO0.OooO0oO(pageId, "pageId");
            this.f73619OooO00o = pageId;
            this.f73620OooO0O0 = pointF;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return OooOOO0.OooO0O0(this.f73619OooO00o, oooO00o.f73619OooO00o) && OooOOO0.OooO0O0(this.f73620OooO0O0, oooO00o.f73620OooO0O0);
        }

        public final int hashCode() {
            return this.f73620OooO0O0.hashCode() + (this.f73619OooO00o.hashCode() * 31);
        }

        public final String toString() {
            return "DefaultPageConfig(pageId=" + this.f73619OooO00o + ", pageOffset=" + this.f73620OooO0O0 + ")";
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooOOo$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f73621OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f73622OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f73623OooO0OO;

        public OooO0O0(String noteId, long j, boolean z) {
            OooOOO0.OooO0oO(noteId, "noteId");
            this.f73621OooO00o = noteId;
            this.f73622OooO0O0 = j;
            this.f73623OooO0OO = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return OooOOO0.OooO0O0(this.f73621OooO00o, oooO0O0.f73621OooO00o) && this.f73622OooO0O0 == oooO0O0.f73622OooO0O0 && this.f73623OooO0OO == oooO0O0.f73623OooO0OO;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f73623OooO0OO) + C20703o000000o.OooO0O0(this.f73621OooO00o.hashCode() * 31, 31, this.f73622OooO0O0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NoteContentModificationState(noteId=");
            sb.append(this.f73621OooO00o);
            sb.append(", lastModificationTime=");
            sb.append(this.f73622OooO0O0);
            sb.append(", shouldNotify=");
            return OooOOO.OooO00o(sb, ")", this.f73623OooO0OO);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooOOo$OooO0OO */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Point f73624OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f73625OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Object f73626OooO0OO;

        public OooO0OO(Point point, int i, Object data) {
            OooOOO0.OooO0oO(point, "point");
            OooOOO0.OooO0oO(data, "data");
            this.f73624OooO00o = point;
            this.f73625OooO0O0 = i;
            this.f73626OooO0OO = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return OooOOO0.OooO0O0(this.f73624OooO00o, oooO0OO.f73624OooO00o) && this.f73625OooO0O0 == oooO0OO.f73625OooO0O0 && OooOOO0.OooO0O0(this.f73626OooO0OO, oooO0OO.f73626OooO0OO);
        }

        public final int hashCode() {
            return this.f73626OooO0OO.hashCode() + C20785Oooo00o.OooO00o(this.f73625OooO0O0, this.f73624OooO00o.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NoteinDragData(point=");
            sb.append(this.f73624OooO00o);
            sb.append(", dataType=");
            sb.append(this.f73625OooO0O0);
            sb.append(", data=");
            return androidx.concurrent.futures.OooO0o.OooO0O0(sb, this.f73626OooO0OO, ")");
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooOOo$OooO0Oo, reason: case insensitive filesystem */
    public interface InterfaceC23345OooO0Oo {
        void OooO00o(AbstractC29372OooO00o abstractC29372OooO00o);

        void OooO0O0(AbstractC29372OooO00o abstractC29372OooO00o);
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooOOo$OooO0o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$onCleared$2", m80623f = "NoteEditorViewModel.kt", m80624l = {1732, 1746}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C23346OooO0o0 f73627OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73628OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f73629OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C23344OooOOo f73630OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C23346OooO0o0 c23346OooO0o0, C23344OooOOo c23344OooOOo, String str, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f73627OooOo = c23346OooO0o0;
            this.f73630OooOoO0 = c23344OooOOo;
            this.f73629OooOoO = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0o(this.f73627OooOo, this.f73630OooOoO0, this.f73629OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
        
            if (r5.f73551OooOO0O.OooOO0o(r4, r13, r12) == r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            OooO0o oooO0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73628OooOo0o;
            String str = this.f73629OooOoO;
            C23344OooOOo c23344OooOOo = this.f73630OooOoO0;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C23346OooO0o0 c23346OooO0o0 = this.f73627OooOo;
                String str2 = c23346OooO0o0 != null ? c23346OooO0o0.f73631OooO00o : null;
                if (str2 != null && str2.length() != 0) {
                    C27449o00O0OoO c27449o00O0OoO = c23344OooOOo.f73545OooO0Oo;
                    OooOOO0.OooO0Oo(c23346OooO0o0);
                    this.f73628OooOo0o = 1;
                    oooO0o = this;
                    if (c27449o00O0OoO.Ooooo0o(c23346OooO0o0.f73632OooO0O0, c23346OooO0o0.f73633OooO0OO, c23346OooO0o0.f73631OooO00o, oooO0o) != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                if (str.length() != 0) {
                    return C32460OooOooO.f116667OooO00o;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteEditorViewModel");
                c20358OooO00o.OooO0o0("NoteViewModel onCleared, noteId: ".concat(str), new Object[0]);
                String strOooO0Oo = c23344OooOOo.f73550OooOO0.OooO0Oo();
                oooO0o.f73628OooOo0o = 2;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    c23344OooOOo.f73565OooOoO.OooO00o(str, CloudMetaType.NOTE);
                    return C32460OooOooO.f116667OooO00o;
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            oooO0o = this;
            if (str.length() != 0) {
            }
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooOOo$OooO0o0, reason: case insensitive filesystem */
    public static final class C23346OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f73631OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f73632OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f73633OooO0OO;

        public C23346OooO0o0(String noteId, String pageId, long j) {
            OooOOO0.OooO0oO(noteId, "noteId");
            OooOOO0.OooO0oO(pageId, "pageId");
            this.f73631OooO00o = noteId;
            this.f73632OooO0O0 = pageId;
            this.f73633OooO0OO = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23346OooO0o0)) {
                return false;
            }
            C23346OooO0o0 c23346OooO0o0 = (C23346OooO0o0) obj;
            return OooOOO0.OooO0O0(this.f73631OooO00o, c23346OooO0o0.f73631OooO00o) && OooOOO0.OooO0O0(this.f73632OooO0O0, c23346OooO0o0.f73632OooO0O0) && this.f73633OooO0OO == c23346OooO0o0.f73633OooO0OO;
        }

        public final int hashCode() {
            return Long.hashCode(this.f73633OooO0OO) + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f73631OooO00o.hashCode() * 31, 31, this.f73632OooO0O0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PageTimestampUpdate(noteId=");
            sb.append(this.f73631OooO00o);
            sb.append(", pageId=");
            sb.append(this.f73632OooO0O0);
            sb.append(", lastModificationTime=");
            return android.support.v4.media.session.OooO00o.OooO00o(this.f73633OooO0OO, ")", sb);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooOOo$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$saveImageBitmap$1", m80623f = "NoteEditorViewModel.kt", m80624l = {829}, m80625m = "invokeSuspend")
    public static final class C23347OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73635OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ File f73636OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Bitmap f73637OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23347OooO0oO(Bitmap bitmap, File file, Continuation<? super C23347OooO0oO> continuation) {
            super(2, continuation);
            this.f73637OooOoO0 = bitmap;
            this.f73636OooOoO = file;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C23344OooOOo.this.new C23347OooO0oO(this.f73637OooOoO0, this.f73636OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23347OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73635OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27449o00O0OoO c27449o00O0OoO = C23344OooOOo.this.f73545OooO0Oo;
                String absolutePath = this.f73636OooOoO.getAbsolutePath();
                OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
                this.f73635OooOo0o = 1;
                c27449o00O0OoO.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                if (C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27602oOooo0o(c27449o00O0OoO, this.f73637OooOoO0, absolutePath, null), this) == enumC32485OooO00o) {
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

    public C23344OooOOo(C27449o00O0OoO c27449o00O0OoO, C27869OooOOO c27869OooOOO, C27710OooO0oo c27710OooO0oo, C27881OooOO0O c27881OooOO0O, C27597o00ooo00 vipFeatureUseCase, o00000O getRemoteConfigUseCase, C27545o00o0oo0 c27545o00o0oo0, C27129OoooOOO c27129OoooOOO, InterfaceC27313OooOoo0 noteMetaRepo, C27020OooOoO0 c27020OooOoO0, C26596o00O0o0 c26596o00O0o0, C26264OooOOO0 c26264OooOOO0, InterfaceC27323Oooo0oO strokeRepo, C26577o000oo0O c26577o000oo0O, C27994OooOOOO c27994OooOOOO, C30982OooO0Oo multiWindowHelper, o0OO0O0O.OooO00o oooO00o, C26649o00OoooO c26649o00OoooO, o0OOOO0.OooO0o oooO0o, C26515OooooO0 c26515OooooO0, InterfaceC27301OooOOo hyperLinkRepo, C27585o00ooO0 c27585o00ooO0, C27428o000oOoO brandUseCase, C27515o00o0000 saveImageToGalleryUseCase, o0ooOOo o0ooooo2, Context context) {
        OooOOO0.OooO0oO(vipFeatureUseCase, "vipFeatureUseCase");
        OooOOO0.OooO0oO(getRemoteConfigUseCase, "getRemoteConfigUseCase");
        OooOOO0.OooO0oO(noteMetaRepo, "noteMetaRepo");
        OooOOO0.OooO0oO(strokeRepo, "strokeRepo");
        OooOOO0.OooO0oO(multiWindowHelper, "multiWindowHelper");
        OooOOO0.OooO0oO(hyperLinkRepo, "hyperLinkRepo");
        OooOOO0.OooO0oO(brandUseCase, "brandUseCase");
        OooOOO0.OooO0oO(saveImageToGalleryUseCase, "saveImageToGalleryUseCase");
        this.f73545OooO0Oo = c27449o00O0OoO;
        this.f73547OooO0o0 = c27869OooOOO;
        this.f73546OooO0o = c27710OooO0oo;
        this.f73548OooO0oO = c27881OooOO0O;
        this.f73549OooO0oo = getRemoteConfigUseCase;
        this.f73544OooO = c27545o00o0oo0;
        this.f73550OooOO0 = c27129OoooOOO;
        this.f73551OooOO0O = noteMetaRepo;
        this.f73552OooOO0o = c27020OooOoO0;
        this.f73554OooOOO0 = c26596o00O0o0;
        this.f73553OooOOO = c26264OooOOO0;
        this.f73555OooOOOO = strokeRepo;
        this.f73556OooOOOo = c26577o000oo0O;
        this.f73558OooOOo0 = c27994OooOOOO;
        this.f73557OooOOo = multiWindowHelper;
        this.f73559OooOOoo = oooO00o;
        this.f73562OooOo00 = c26649o00OoooO;
        this.f73561OooOo0 = oooO0o;
        this.f73563OooOo0O = c26515OooooO0;
        this.f73564OooOo0o = hyperLinkRepo;
        this.f73560OooOo = c27585o00ooO0;
        this.f73566OooOoO0 = saveImageToGalleryUseCase;
        this.f73565OooOoO = o0ooooo2;
        this.f73567OooOoOO = C20519OooO0Oo.OooO0OO(new C26188OoooOo0(this, 1));
        this.f73569OooOoo0 = new C28693OooOO0();
        C26522o000000o c26522o000000oOooO0OO = c26577o000oo0O.OooO0OO(App.f69562OoooOOO);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33779o00Oo0 c33779o00Oo0OooO00o = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        Boolean bool = Boolean.FALSE;
        this.f73568OooOoo = C25252OooO0Oo.OooOoO0(c26522o000000oOooO0OO, interfaceC33636Oooo00oOooO00o, c33779o00Oo0OooO00o, bool);
        this.f73570OooOooO = new File(context.getCacheDir(), "drag_records");
        AbstractC24338OooO0o0.OooO00o<Integer> key = App.f69572Oooooo;
        OooOOO0.OooO0oO(key, "key");
        OooOO0<AbstractC24338OooO0o0> oooOO02 = c26577o000oo0O.f91598OooO00o;
        this.f73571OooOooo = C25252OooO0Oo.OooOoO0(new o0000OO(oooOO02.getData(), key), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), 1);
        AbstractC24338OooO0o0.OooO00o<Boolean> key2 = App.f69570OooooOO;
        OooOOO0.OooO0oO(key2, "key");
        this.f73574Oooo000 = C25252OooO0Oo.OooOoO0(new C26540o0000oo(oooOO02.getData(), key2), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool);
        AbstractC24338OooO0o0.OooO00o<Boolean> key3 = App.f69573Oooooo0;
        OooOOO0.OooO0oO(key3, "key");
        this.f73575Oooo00O = C25252OooO0Oo.OooOoO0(new o0000O00(oooOO02.getData(), key3), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool);
        AbstractC24338OooO0o0.OooO00o<Integer> key4 = App.f69569OooooO0;
        OooOOO0.OooO0oO(key4, "key");
        this.f73576Oooo00o = C25252OooO0Oo.OooOoO0(new o0000O0O(oooOO02.getData(), key4), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), 0);
        AbstractC24338OooO0o0.OooO00o<Boolean> key5 = App.f69568Ooooo0o;
        OooOOO0.OooO0oO(key5, "key");
        o0000O0 o0000o0 = new o0000O0(oooOO02.getData(), key5);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = o0OoOo0.OooO00o(this);
        C33779o00Oo0 c33779o00Oo0OooO00o2 = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        Boolean bool2 = Boolean.TRUE;
        C25252OooO0Oo.OooOoO0(o0000o0, interfaceC33636Oooo00oOooO00o2, c33779o00Oo0OooO00o2, bool2);
        this.f73573Oooo0 = C33784o00ooo.OooO00o(null);
        this.f73577Oooo0O0 = C33784o00ooo.OooO00o(null);
        this.f73578Oooo0OO = C33784o00ooo.OooO00o(bool);
        AbstractC24338OooO0o0.OooO00o<Boolean> key6 = App.f69592o00oO0o;
        OooOOO0.OooO0oO(key6, "key");
        this.f73580Oooo0o0 = C25252OooO0Oo.OooOoO0(new C26688o0ooOO0(oooOO02.getData(), key6), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool);
        AbstractC24338OooO0o0.OooO00o<Float> key7 = App.f69588o00Oo0;
        OooOOO0.OooO0oO(key7, "key");
        this.f73579Oooo0o = new C28976o0ooOO(new C26534o0000o0O(oooOO02.getData(), key7));
        AbstractC24338OooO0o0.OooO00o<Boolean> key8 = App.f69561OoooOO0;
        OooOOO0.OooO0oO(key8, "key");
        this.f73581Oooo0oO = C25252OooO0Oo.OooOoO0(new o000(oooOO02.getData(), key8), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool2);
        AbstractC24338OooO0o0.OooO00o<Boolean> key9 = App.f69586o000oOoO;
        OooOOO0.OooO0oO(key9, "key");
        this.f73582Oooo0oo = C25252OooO0Oo.OooOoO0(new C26553o000OoO(oooOO02.getData(), key9), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool);
        AbstractC24338OooO0o0.OooO00o<Boolean> key10 = App.f69604ooOO;
        OooOOO0.OooO0oO(key10, "key");
        this.f73572Oooo = C25252OooO0Oo.OooOoO0(new o000OO(oooOO02.getData(), key10), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool);
        AbstractC24338OooO0o0.OooO00o<Boolean> key11 = App.f69587o00O0O;
        OooOOO0.OooO0oO(key11, "key");
        this.f73585OoooO00 = C25252OooO0Oo.OooOoO0(new o0000OO0(oooOO02.getData(), key11), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool);
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(OooO00o.f73618OooO0OO);
        this.f73584OoooO0 = c33781o00o0OOooO00o;
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o(null);
        this.f73586OoooO0O = c33781o00o0OOooO00o2;
        AbstractC24338OooO0o0.OooO00o<Boolean> key12 = App.f69593o00ooo;
        OooOOO0.OooO0oO(key12, "key");
        this.f73583OoooO = C25252OooO0Oo.OooOoO0(new o0O0O00(oooOO02.getData(), key12), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool);
        AbstractC24338OooO0o0.OooO00o<Boolean> key13 = App.f69584o00000o0;
        OooOOO0.OooO0oO(key13, "key");
        this.f73587OoooOO0 = C25252OooO0Oo.OooOoO0(new C26543o000O0o(oooOO02.getData(), key13), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool2);
        C33781o00o0O c33781o00o0OOooO00o3 = C33784o00ooo.OooO00o(bool);
        this.f73602o000oOoO = c33781o00o0OOooO00o3;
        C33781o00o0O c33781o00o0OOooO00o4 = C33784o00ooo.OooO00o("");
        this.f73588OoooOOO = c33781o00o0OOooO00o4;
        this.f73589OoooOOo = c33781o00o0OOooO00o4;
        C33781o00o0O c33781o00o0OOooO00o5 = C33784o00ooo.OooO00o(-1);
        this.f73590OoooOo0 = c33781o00o0OOooO00o5;
        C33781o00o0O c33781o00o0OOooO00o6 = C33784o00ooo.OooO00o(null);
        this.f73591OoooOoO = c33781o00o0OOooO00o6;
        C33799OooOO0O c33799OooOO0OOooOoO = C25252OooO0Oo.OooOoO(c33781o00o0OOooO00o4, new C28941o00oO0(this, null));
        C28890o00OoOo c28890o00OoOo = new C28890o00OoOo();
        C24039Oooo0o0.OooO0o0(2, c28890o00OoOo);
        C33769Ooooo0o c33769Ooooo0oOooOoO0 = C25252OooO0Oo.OooOoO0(new o000Oo0(C25252OooO0Oo.OooOO0o(new C33763OoooOOO(new C33763OoooOOO(c33799OooOO0OOooOoO, new C33720OooO0Oo(c28890o00OoOo, c33781o00o0OOooO00o5), new C28906o00o0(3, null)), c33781o00o0OOooO00o6, new C28920o00o0O00(3, null))), new C28921o00o0O0O(2, null), 1), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), new NoteContent(null, null, null, null, null, null, 0, null, 0.0f, 0.0f, 0.0f, false, 0L, 0L, null, 32767, null));
        this.f73592OoooOoo = c33769Ooooo0oOooOoO0;
        this.f73593Ooooo00 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(c33781o00o0OOooO00o4, new C28946o00oO0O0(this, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), new NoteMeta(null, null, null, null, null, false, null, 0, 0, false, null, 0, 0L, 0L, null, false, false, false, 0L, 524287, null));
        this.f73594Ooooo0o = true;
        InterfaceC33721OooO0o<Integer> interfaceC33721OooO0oOooO0o0 = vipFeatureUseCase.OooO0o0(12);
        this.f73595OooooO0 = interfaceC33721OooO0oOooO0o0;
        this.f73596OooooOO = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(interfaceC33721OooO0oOooO0o0, c33769Ooooo0oOooOoO0, new C28953o00oOOo0(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool);
        this.f73597OooooOo = C33900OooO0o0.OooO00o();
        this.f73601Ooooooo = C25252OooO0Oo.OooOoO0(vipFeatureUseCase.OooO0o0(25), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f73612o0OoOo0 = C25252OooO0Oo.OooOoO0(vipFeatureUseCase.OooO0o0(33), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        C33769Ooooo0o c33769Ooooo0oOooOoO02 = C25252OooO0Oo.OooOoO0(new C28948o00oOO(c33769Ooooo0oOooOoO0), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), new C32443OooOOO("", 0L));
        this.f73617ooOO = c33769Ooooo0oOooOoO02;
        this.f73603o00O0O = new C28949o00oOOO0(new C28955o00oOo(new C33759OoooO0(new OooO0O0("", 0L, false), new C28944o00oO00o(c33769Ooooo0oOooOoO02), new OooOo00(3, null))));
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new C28893o00OoOoo(this, context, null), 3);
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new C28896o00Ooo00(this, null), 3);
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        this.f73604o00Oo0 = C33784o00ooo.OooO00o(c34434OooOoO);
        AbstractC24338OooO0o0.OooO00o<Integer> key14 = App.f69565OoooOoO;
        OooOOO0.OooO0oO(key14, "key");
        C26682o00oO0O c26682o00oO0O = new C26682o00oO0O(oooOO02.getData(), key14);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o3 = o0OoOo0.OooO00o(this);
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        C33769Ooooo0o c33769Ooooo0oOooOoO03 = C25252OooO0Oo.OooOoO0(c26682o00oO0O, C33633Oooo0.OooO0oO(interfaceC33636Oooo00oOooO00o3, executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), 0);
        this.f73605o00Ooo = c33769Ooooo0oOooOoO03;
        AbstractC24338OooO0o0.OooO00o<Boolean> key15 = App.f69566OoooOoo;
        OooOOO0.OooO0oO(key15, "key");
        C33769Ooooo0o c33769Ooooo0oOooOoO04 = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(C25252OooO0Oo.OooOO0(c33769Ooooo0oOooOoO0, c33769Ooooo0oOooOoO03, new C26539o0000oOo(oooOO02.getData(), key15), c33781o00o0OOooO00o, c33781o00o0OOooO00o2, new C23349OooOOoo(this, null)), c33781o00o0OOooO00o3, new C28909o00o0000(3, null)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f73606o00o0O = c33769Ooooo0oOooOoO04;
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f73609o00ooo = c33772OooooOoOooO0O0;
        this.f73616oo000o = c33772OooooOoOooO0O0;
        C33772OooooOo c33772OooooOoOooO0O02 = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f73608o00oO0o = c33772OooooOoOooO0O02;
        this.f73607o00oO0O = c33772OooooOoOooO0O02;
        C25252OooO0Oo.OooOoO(c33769Ooooo0oOooOoO04, new o0oOOo(this, null));
        C33781o00o0O c33781o00o0OOooO00o7 = C33784o00ooo.OooO00o(c34434OooOoO);
        this.f73613o0ooOO0 = c33781o00o0OOooO00o7;
        this.f73614o0ooOOo = c33781o00o0OOooO00o7;
        C33781o00o0O c33781o00o0OOooO00o8 = C33784o00ooo.OooO00o(c34434OooOoO);
        this.f73615o0ooOoO = c33781o00o0OOooO00o8;
        this.f73610o0OOO0o = c33781o00o0OOooO00o8;
        this.f73611o0Oo0oo = C33900OooO0o0.OooO00o();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x057a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x042d -> B:105:0x0438). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x048c -> B:105:0x0438). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0496 -> B:113:0x04a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x0501 -> B:119:0x04ee). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0329 -> B:113:0x04a4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OooO0o(com.orion.notein.p607ui.noteeditor.C23344OooOOo r34, java.lang.String r35, java.util.List r36, java.util.List r37, oO00ooo.AbstractC32479OooO0OO r38) {
        /*
            Method dump skipped, instruction units count: 1472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.p607ui.noteeditor.C23344OooOOo.OooO0o(com.orion.notein.ui.noteeditor.OooOOo, java.lang.String, java.util.List, java.util.List, oO00ooo.OooO0OO):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o0(C23344OooOOo c23344OooOOo, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28898o00Ooo0o c28898o00Ooo0o;
        c23344OooOOo.getClass();
        if (abstractC32479OooO0OO instanceof C28898o00Ooo0o) {
            c28898o00Ooo0o = (C28898o00Ooo0o) abstractC32479OooO0OO;
            int i2 = c28898o00Ooo0o.f102385OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28898o00Ooo0o.f102385OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                c28898o00Ooo0o = new C28898o00Ooo0o(c23344OooOOo, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c28898o00Ooo0o.f102383OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c28898o00Ooo0o.f102385OooOoO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            if (i == 0) {
                c28898o00Ooo0o.f102384OooOo0o = i;
                c28898o00Ooo0o.f102385OooOoO = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28922o00o0OO(c23344OooOOo, null), c28898o00Ooo0o);
                if (objOooO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
            return new Integer(i);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = c28898o00Ooo0o.f102384OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0o);
        if (((Boolean) objOooO0o).booleanValue()) {
            return new Integer(1);
        }
        return new Integer(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x038b, code lost:
    
        if (r11.emit(r2, r5) == r6) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0oO(C23344OooOOo c23344OooOOo, Point point, ClipData clipData, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28927o00o0Oo0 c28927o00o0Oo0;
        ClipDescription description;
        int i;
        Image image;
        InterfaceC31284OooO0O0 displayItem;
        C33772OooooOo c33772OooooOo;
        OooO0OO oooO0OO;
        C33772OooooOo c33772OooooOo2;
        OooO0OO oooO0OO2;
        C33772OooooOo c33772OooooOo3;
        OooO0OO oooO0OO3;
        C23344OooOOo c23344OooOOo2 = c23344OooOOo;
        Point point2 = point;
        if (abstractC32479OooO0OO instanceof C28927o00o0Oo0) {
            c28927o00o0Oo0 = (C28927o00o0Oo0) abstractC32479OooO0OO;
            int i2 = c28927o00o0Oo0.f102490OooOoo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28927o00o0Oo0.f102490OooOoo = i2 - Integer.MIN_VALUE;
            } else {
                c28927o00o0Oo0 = new C28927o00o0Oo0(c23344OooOOo2, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oo = c28927o00o0Oo0.f102489OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        try {
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteEditorViewModel");
            c20358OooO00o.OooO0Oo(e, "Unable to handle drag data", new Object[0]);
        }
        switch (c28927o00o0Oo0.f102490OooOoo) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooO0oo);
                description = clipData.getDescription();
                i = description.getExtras().getInt(DragConstants.NOTEIN_DRAG_DATA_TYPE, -1);
                if (i == -1) {
                    return C32460OooOooO.f116667OooO00o;
                }
                C33772OooooOo c33772OooooOo4 = c23344OooOOo2.f73609o00ooo;
                if (i == 0) {
                    String string = description.getExtras().getString(DragConstants.NOTEIN_DRAG_DATA_ID, "");
                    String string2 = description.getExtras().getString(DragConstants.NOTEIN_DRAG_DATA_JSON, null);
                    if ((string == null || string.length() == 0) && (string2 == null || string2.length() == 0)) {
                        if (description.hasMimeType("image/*")) {
                            Uri uri = clipData.getItemAt(0).getUri();
                            OooOOO0.OooO0Oo(uri);
                            OooO0OO oooO0OO4 = new OooO0OO(point2, i, uri);
                            c28927o00o0Oo0.f102490OooOoo = 3;
                            break;
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                    if (string != null && string.length() != 0) {
                        C26596o00O0o0 c26596o00O0o0 = c23344OooOOo2.f73554OooOOO0;
                        String id = ((NoteContent) c23344OooOOo2.f73592OoooOoo.f121747OooOo0o.getValue()).getId();
                        c28927o00o0Oo0.f102486OooOo0o = c23344OooOOo2;
                        c28927o00o0Oo0.f102485OooOo = point2;
                        c28927o00o0Oo0.f102487OooOoO = i;
                        c28927o00o0Oo0.f102490OooOoo = 1;
                        objOooO0oo = c26596o00O0o0.OooO0oo(string, id, c28927o00o0Oo0);
                        if (objOooO0oo == enumC32485OooO00o) {
                        }
                        OooOOO0.OooO0Oo(objOooO0oo);
                        image = (Image) objOooO0oo;
                        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(image.getUri());
                        String uri2 = image.getUri();
                        RectF bounds = image.getBounds();
                        OooOOO0.OooO0Oo(bounds);
                        float rotation = image.getRotation();
                        OooOOO0.OooO0Oo(bitmapDecodeFile);
                        ImageInfo imageInfo = new ImageInfo(null, uri2, bounds, rotation, LayerInfo.UNSPECIFIED_LAYER_ID, 0L, bitmapDecodeFile, false, 161, null);
                        c33772OooooOo = c23344OooOOo2.f73609o00ooo;
                        oooO0OO = new OooO0OO(point2, i, imageInfo);
                        c28927o00o0Oo0.f102486OooOo0o = null;
                        c28927o00o0Oo0.f102485OooOo = null;
                        c28927o00o0Oo0.f102490OooOoo = 2;
                        if (c33772OooooOo.emit(oooO0OO, c28927o00o0Oo0) == enumC32485OooO00o) {
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                    image = (Image) new Gson().fromJson(string2, Image.class);
                    Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(image.getUri());
                    String uri22 = image.getUri();
                    RectF bounds2 = image.getBounds();
                    OooOOO0.OooO0Oo(bounds2);
                    float rotation2 = image.getRotation();
                    OooOOO0.OooO0Oo(bitmapDecodeFile2);
                    ImageInfo imageInfo2 = new ImageInfo(null, uri22, bounds2, rotation2, LayerInfo.UNSPECIFIED_LAYER_ID, 0L, bitmapDecodeFile2, false, 161, null);
                    c33772OooooOo = c23344OooOOo2.f73609o00ooo;
                    oooO0OO = new OooO0OO(point2, i, imageInfo2);
                    c28927o00o0Oo0.f102486OooOo0o = null;
                    c28927o00o0Oo0.f102485OooOo = null;
                    c28927o00o0Oo0.f102490OooOoo = 2;
                    if (c33772OooooOo.emit(oooO0OO, c28927o00o0Oo0) == enumC32485OooO00o) {
                    }
                    return C32460OooOooO.f116667OooO00o;
                    return enumC32485OooO00o;
                }
                if (i == 1) {
                    String string3 = description.getExtras().getString(DragConstants.NOTEIN_DRAG_DATA_ID, null);
                    if (string3 != null && string3.length() != 0) {
                        C26264OooOOO0 c26264OooOOO0 = c23344OooOOo2.f73553OooOOO;
                        String str = (String) c23344OooOOo2.f73589OoooOOo.getValue();
                        c28927o00o0Oo0.f102486OooOo0o = c23344OooOOo2;
                        c28927o00o0Oo0.f102485OooOo = point2;
                        c28927o00o0Oo0.f102487OooOoO = i;
                        c28927o00o0Oo0.f102490OooOoo = 6;
                        objOooO0oo = c26264OooOOO0.OooO0OO(string3, str, c28927o00o0Oo0);
                        if (objOooO0oo == enumC32485OooO00o) {
                        }
                        displayItem = ((TextBox) objOooO0oo).toDisplayItem();
                        String string4 = UUID.randomUUID().toString();
                        OooOOO0.OooO0o(string4, "toString(...)");
                        InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy = displayItem.deepCopy(string4, LayerInfo.UNSPECIFIED_LAYER_ID, System.currentTimeMillis());
                        c33772OooooOo3 = c23344OooOOo2.f73609o00ooo;
                        oooO0OO3 = new OooO0OO(point2, i, interfaceC31284OooO0O0DeepCopy);
                        c28927o00o0Oo0.f102486OooOo0o = null;
                        c28927o00o0Oo0.f102485OooOo = null;
                        c28927o00o0Oo0.f102490OooOoo = 7;
                        if (c33772OooooOo3.emit(oooO0OO3, c28927o00o0Oo0) == enumC32485OooO00o) {
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                    String string5 = description.getExtras().getString(DragConstants.NOTEIN_DRAG_DATA_JSON, null);
                    if (string5 == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    displayItem = (InterfaceC31284OooO0O0) new Gson().fromJson(string5, TextBoxInfo.class);
                    String string42 = UUID.randomUUID().toString();
                    OooOOO0.OooO0o(string42, "toString(...)");
                    InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy2 = displayItem.deepCopy(string42, LayerInfo.UNSPECIFIED_LAYER_ID, System.currentTimeMillis());
                    c33772OooooOo3 = c23344OooOOo2.f73609o00ooo;
                    oooO0OO3 = new OooO0OO(point2, i, interfaceC31284OooO0O0DeepCopy2);
                    c28927o00o0Oo0.f102486OooOo0o = null;
                    c28927o00o0Oo0.f102485OooOo = null;
                    c28927o00o0Oo0.f102490OooOoo = 7;
                    if (c33772OooooOo3.emit(oooO0OO3, c28927o00o0Oo0) == enumC32485OooO00o) {
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                if (i == 2) {
                    String string6 = description.getExtras().getString("drag_data_html", null);
                    if (string6 == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooO0OO oooO0OO5 = new OooO0OO(point2, i, string6);
                    c28927o00o0Oo0.f102490OooOoo = 8;
                    if (c33772OooooOo4.emit(oooO0OO5, c28927o00o0Oo0) == enumC32485OooO00o) {
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                File file = c23344OooOOo2.f73570OooOooO;
                if (i == 3) {
                    Gson gson = new Gson();
                    String strOooO00o = C31186OooO0Oo.OooO00o(file);
                    Type type = new C28926o00o0Oo().getType();
                    OooOOO0.OooO0o(type, "getType(...)");
                    Object objFromJson = gson.fromJson(strOooO00o, type);
                    OooOOO0.OooO0o(objFromJson, "fromJson(...)");
                    Iterable<DrawRecord> iterable = (Iterable) objFromJson;
                    ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
                    for (DrawRecord drawRecord : iterable) {
                        String string7 = UUID.randomUUID().toString();
                        OooOOO0.OooO0o(string7, "toString(...)");
                        arrayList.add(drawRecord.deepCopy(string7, LayerInfo.UNSPECIFIED_LAYER_ID, System.currentTimeMillis()));
                    }
                    C31190OooO0oo.OooO0oo(file);
                    OooO0OO oooO0OO6 = new OooO0OO(point2, i, arrayList);
                    c28927o00o0Oo0.f102490OooOoo = 9;
                    if (c33772OooooOo4.emit(oooO0OO6, c28927o00o0Oo0) == enumC32485OooO00o) {
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                if (i != 5) {
                    if (i != 7 && i != 8) {
                        throw new NotImplementedException("dataType: " + i);
                    }
                    String strOooO00o2 = C31186OooO0Oo.OooO00o(file);
                    Type type2 = new C28928o00o0OoO().getType();
                    OooOOO0.OooO0o(type2, "getType(...)");
                    Object value = C28028OooO0o.f99373OooO0O0.getValue();
                    OooOOO0.OooO0o(value, "getValue(...)");
                    Object objFromJson2 = ((Gson) value).fromJson(strOooO00o2, type2);
                    OooOOO0.OooO0o(objFromJson2, "fromJson(...)");
                    Iterable<InterfaceC31284OooO0O0> iterable2 = (Iterable) objFromJson2;
                    ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
                    for (InterfaceC31284OooO0O0 interfaceC31284OooO0O0 : iterable2) {
                        String string8 = UUID.randomUUID().toString();
                        OooOOO0.OooO0o(string8, "toString(...)");
                        arrayList2.add(interfaceC31284OooO0O0.deepCopy(string8, LayerInfo.UNSPECIFIED_LAYER_ID, System.currentTimeMillis()));
                    }
                    C31190OooO0oo.OooO0oo(file);
                    OooO0OO oooO0OO7 = new OooO0OO(point2, i, arrayList2);
                    c28927o00o0Oo0.f102490OooOoo = 10;
                    if (c33772OooooOo4.emit(oooO0OO7, c28927o00o0Oo0) == enumC32485OooO00o) {
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                C33772OooooOo c33772OooooOo5 = c23344OooOOo2.f73608o00oO0o;
                Boolean bool = Boolean.TRUE;
                c28927o00o0Oo0.f102486OooOo0o = c23344OooOOo2;
                c28927o00o0Oo0.f102485OooOo = point2;
                c28927o00o0Oo0.f102488OooOoO0 = description;
                c28927o00o0Oo0.f102487OooOoO = i;
                c28927o00o0Oo0.f102490OooOoo = 4;
                if (c33772OooooOo5.emit(bool, c28927o00o0Oo0) != enumC32485OooO00o) {
                    C28693OooOO0 c28693OooOO0 = new C28693OooOO0();
                    PersistableBundle extras = description.getExtras();
                    c28693OooOO0.f101655OooO0O0 = extras.getInt("drag_index", -1);
                    c28693OooOO0.f101656OooO0OO = extras.getString("source_note_id", null);
                    c28693OooOO0.f101657OooO0Oo = extras.getString("source_page_id", null);
                    c28693OooOO0.f101659OooO0o0 = new Integer(extras.getInt("source_type", 0));
                    c28693OooOO0.f101658OooO0o = extras.getString("image_path");
                    String string9 = extras.getString("source_bounds");
                    Gson gson2 = new Gson();
                    c28693OooOO0.f101660OooO0oO = (RectF) gson2.fromJson(string9, RectF.class);
                    c28693OooOO0.f101661OooO0oo = (RectF) gson2.fromJson(extras.getString("source_bounds_of_page"), RectF.class);
                    c28693OooOO0.f101653OooO = extras.getString(DragConstants.NOTEIN_DRAG_HOST_ACTIVITY_HASH);
                    c28693OooOO0.f101662OooOO0 = extras.getInt("drop_index", -1);
                    c28693OooOO0.f101664OooOO0o = extras.getString("ref_page_id", null);
                    c28693OooOO0.OooO0O0(1);
                    c23344OooOOo2.f73569OooOoo0 = c28693OooOO0;
                    c33772OooooOo2 = c23344OooOOo2.f73609o00ooo;
                    oooO0OO2 = new OooO0OO(point2, i, c28693OooOO0);
                    c28927o00o0Oo0.f102486OooOo0o = null;
                    c28927o00o0Oo0.f102485OooOo = null;
                    c28927o00o0Oo0.f102488OooOoO0 = null;
                    c28927o00o0Oo0.f102490OooOoo = 5;
                    if (c33772OooooOo2.emit(oooO0OO2, c28927o00o0Oo0) == enumC32485OooO00o) {
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                return enumC32485OooO00o;
            case 1:
                int i3 = c28927o00o0Oo0.f102487OooOoO;
                point2 = c28927o00o0Oo0.f102485OooOo;
                C23344OooOOo c23344OooOOo3 = c28927o00o0Oo0.f102486OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oo);
                i = i3;
                c23344OooOOo2 = c23344OooOOo3;
                OooOOO0.OooO0Oo(objOooO0oo);
                image = (Image) objOooO0oo;
                Bitmap bitmapDecodeFile22 = BitmapFactory.decodeFile(image.getUri());
                String uri222 = image.getUri();
                RectF bounds22 = image.getBounds();
                OooOOO0.OooO0Oo(bounds22);
                float rotation22 = image.getRotation();
                OooOOO0.OooO0Oo(bitmapDecodeFile22);
                ImageInfo imageInfo22 = new ImageInfo(null, uri222, bounds22, rotation22, LayerInfo.UNSPECIFIED_LAYER_ID, 0L, bitmapDecodeFile22, false, 161, null);
                c33772OooooOo = c23344OooOOo2.f73609o00ooo;
                oooO0OO = new OooO0OO(point2, i, imageInfo22);
                c28927o00o0Oo0.f102486OooOo0o = null;
                c28927o00o0Oo0.f102485OooOo = null;
                c28927o00o0Oo0.f102490OooOoo = 2;
                if (c33772OooooOo.emit(oooO0OO, c28927o00o0Oo0) == enumC32485OooO00o) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 2:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                C32446OooOOOo.OooO0O0(objOooO0oo);
                return C32460OooOooO.f116667OooO00o;
            case 4:
                int i4 = c28927o00o0Oo0.f102487OooOoO;
                ClipDescription clipDescription = c28927o00o0Oo0.f102488OooOoO0;
                Point point3 = c28927o00o0Oo0.f102485OooOo;
                C23344OooOOo c23344OooOOo4 = c28927o00o0Oo0.f102486OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oo);
                i = i4;
                c23344OooOOo2 = c23344OooOOo4;
                description = clipDescription;
                point2 = point3;
                C28693OooOO0 c28693OooOO02 = new C28693OooOO0();
                PersistableBundle extras2 = description.getExtras();
                c28693OooOO02.f101655OooO0O0 = extras2.getInt("drag_index", -1);
                c28693OooOO02.f101656OooO0OO = extras2.getString("source_note_id", null);
                c28693OooOO02.f101657OooO0Oo = extras2.getString("source_page_id", null);
                c28693OooOO02.f101659OooO0o0 = new Integer(extras2.getInt("source_type", 0));
                c28693OooOO02.f101658OooO0o = extras2.getString("image_path");
                String string92 = extras2.getString("source_bounds");
                Gson gson22 = new Gson();
                c28693OooOO02.f101660OooO0oO = (RectF) gson22.fromJson(string92, RectF.class);
                c28693OooOO02.f101661OooO0oo = (RectF) gson22.fromJson(extras2.getString("source_bounds_of_page"), RectF.class);
                c28693OooOO02.f101653OooO = extras2.getString(DragConstants.NOTEIN_DRAG_HOST_ACTIVITY_HASH);
                c28693OooOO02.f101662OooOO0 = extras2.getInt("drop_index", -1);
                c28693OooOO02.f101664OooOO0o = extras2.getString("ref_page_id", null);
                c28693OooOO02.OooO0O0(1);
                c23344OooOOo2.f73569OooOoo0 = c28693OooOO02;
                c33772OooooOo2 = c23344OooOOo2.f73609o00ooo;
                oooO0OO2 = new OooO0OO(point2, i, c28693OooOO02);
                c28927o00o0Oo0.f102486OooOo0o = null;
                c28927o00o0Oo0.f102485OooOo = null;
                c28927o00o0Oo0.f102488OooOoO0 = null;
                c28927o00o0Oo0.f102490OooOoo = 5;
                if (c33772OooooOo2.emit(oooO0OO2, c28927o00o0Oo0) == enumC32485OooO00o) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 6:
                int i5 = c28927o00o0Oo0.f102487OooOoO;
                point2 = c28927o00o0Oo0.f102485OooOo;
                C23344OooOOo c23344OooOOo5 = c28927o00o0Oo0.f102486OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oo);
                i = i5;
                c23344OooOOo2 = c23344OooOOo5;
                displayItem = ((TextBox) objOooO0oo).toDisplayItem();
                String string422 = UUID.randomUUID().toString();
                OooOOO0.OooO0o(string422, "toString(...)");
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy22 = displayItem.deepCopy(string422, LayerInfo.UNSPECIFIED_LAYER_ID, System.currentTimeMillis());
                c33772OooooOo3 = c23344OooOOo2.f73609o00ooo;
                oooO0OO3 = new OooO0OO(point2, i, interfaceC31284OooO0O0DeepCopy22);
                c28927o00o0Oo0.f102486OooOo0o = null;
                c28927o00o0Oo0.f102485OooOo = null;
                c28927o00o0Oo0.f102490OooOoo = 7;
                if (c33772OooooOo3.emit(oooO0OO3, c28927o00o0Oo0) == enumC32485OooO00o) {
                }
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, com.orion.notein.ui.noteeditor.OooOOo$OooO0o0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0oo(C23344OooOOo c23344OooOOo, String str, long j, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28950o00oOOOO c28950o00oOOOO;
        C24034Oooo00O c24034Oooo00O;
        C33898OooO0Oo c33898OooO0Oo;
        c23344OooOOo.getClass();
        if (abstractC32479OooO0OO instanceof C28950o00oOOOO) {
            c28950o00oOOOO = (C28950o00oOOOO) abstractC32479OooO0OO;
            int i = c28950o00oOOOO.f102576OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28950o00oOOOO.f102576OooOooo = i - Integer.MIN_VALUE;
            } else {
                c28950o00oOOOO = new C28950o00oOOOO(c23344OooOOo, abstractC32479OooO0OO);
            }
        }
        Object obj = c28950o00oOOOO.f102573OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28950o00oOOOO.f102576OooOooo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (str2.length() == 0) {
                return C32460OooOooO.f116667OooO00o;
            }
            c24034Oooo00O = new C24034Oooo00O();
            c28950o00oOOOO.f102569OooOo0o = c23344OooOOo;
            c28950o00oOOOO.f102568OooOo = str;
            c28950o00oOOOO.f102571OooOoO0 = str2;
            c28950o00oOOOO.f102570OooOoO = c24034Oooo00O;
            c33898OooO0Oo = c23344OooOOo.f73597OooooOo;
            c28950o00oOOOO.f102572OooOoOO = c33898OooO0Oo;
            c28950o00oOOOO.f102574OooOoo0 = j;
            c28950o00oOOOO.f102576OooOooo = 1;
            if (c33898OooO0Oo.OooO00o(c28950o00oOOOO) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c28950o00oOOOO.f102574OooOoo0;
            C33898OooO0Oo c33898OooO0Oo2 = c28950o00oOOOO.f102572OooOoOO;
            C24034Oooo00O c24034Oooo00O2 = c28950o00oOOOO.f102570OooOoO;
            str2 = c28950o00oOOOO.f102571OooOoO0;
            String str3 = c28950o00oOOOO.f102568OooOo;
            C23344OooOOo c23344OooOOo2 = c28950o00oOOOO.f102569OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c33898OooO0Oo = c33898OooO0Oo2;
            c24034Oooo00O = c24034Oooo00O2;
            c23344OooOOo = c23344OooOOo2;
            str = str3;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = jElapsedRealtime - c23344OooOOo.f73599Oooooo0;
            if (j2 >= 500) {
                o00000OO o00000oo2 = c23344OooOOo.f73600OoooooO;
                if (o00000oo2 != null) {
                    o00000oo2.cancel((CancellationException) null);
                }
                c23344OooOOo.f73600OoooooO = null;
                c23344OooOOo.f73598Oooooo = null;
                c23344OooOOo.f73599Oooooo0 = jElapsedRealtime;
                c24034Oooo00O.f80942OooOo0o = new C23346OooO0o0(str2, str, j);
            } else {
                c23344OooOOo.f73598Oooooo = new C23346OooO0o0(str2, str, j);
                o00000OO o00000oo3 = c23344OooOOo.f73600OoooooO;
                if (o00000oo3 == null || !o00000oo3.isActive()) {
                    long j3 = 500 - j2;
                    if (j3 < 0) {
                        j3 = 0;
                    }
                    c23344OooOOo.f73600OoooooO = C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c23344OooOOo), null, null, new C23352OooOo0o(j3, c23344OooOOo, null), 3);
                }
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            c33898OooO0Oo.OooOOO0(null);
            C23346OooO0o0 c23346OooO0o0 = (C23346OooO0o0) c24034Oooo00O.f80942OooOo0o;
            if (c23346OooO0o0 != null) {
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c23344OooOOo);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooOo(c23344OooOOo, c23346OooO0o0, null), 2);
            }
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            c33898OooO0Oo.OooOOO0(null);
            throw th;
        }
    }

    public static void OooOOO0(C29373OooO0O0 c29373OooO0O0, ArrayList arrayList) {
        if (c29373OooO0O0 == null) {
            return;
        }
        C28889o00OoOOo c28889o00OoOOo = new C28889o00OoOOo(0);
        DrawResult drawResult = c29373OooO0O0.f104152OooO0Oo;
        while (((Boolean) c28889o00OoOOo.invoke(OooOo.OoooOo0(arrayList), c29373OooO0O0)).booleanValue()) {
            Object objRemove = arrayList.remove(arrayList.size() - 1);
            OooOOO0.OooO0o0(objRemove, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.operation.PageDrawOperation");
            RectF dirtyRect = drawResult.getDirtyRect();
            DrawResult drawResult2 = ((C29373OooO0O0) objRemove).f104152OooO0Oo;
            dirtyRect.union(drawResult2.getDirtyRect());
            drawResult = new DrawResult(drawResult.getUpdateMode(), drawResult.getItem(), OooOo.OooooOO(drawResult.getNewItemList(), drawResult2.getNewItemList()), OooOo.OooooOO(drawResult.getRemoveItemList(), drawResult2.getRemoveItemList()), null, drawResult.getNeedClear() | drawResult2.getNeedClear(), false, null, drawResult.getDirtyRect(), true, null, 1232, null);
        }
        List<InterfaceC31284OooO0O0> newItemList = drawResult.getNewItemList();
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(newItemList, 10));
        Iterator<T> it = newItemList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC31284OooO0O0) it.next()).getId());
        }
        Set setO0OO00O = OooOo.o0OO00O(arrayList2);
        List<InterfaceC31284OooO0O0> removeItemList = drawResult.getRemoveItemList();
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(removeItemList, 10));
        Iterator<T> it2 = removeItemList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((InterfaceC31284OooO0O0) it2.next()).getId());
        }
        Set setO0OO00O2 = OooOo.o0OO00O(arrayList3);
        List<InterfaceC31284OooO0O0> newItemList2 = drawResult.getNewItemList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : newItemList2) {
            if (!setO0OO00O2.contains(((InterfaceC31284OooO0O0) obj).getId())) {
                arrayList4.add(obj);
            }
        }
        List<InterfaceC31284OooO0O0> removeItemList2 = drawResult.getRemoveItemList();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : removeItemList2) {
            if (!setO0OO00O.contains(((InterfaceC31284OooO0O0) obj2).getId())) {
                arrayList5.add(obj2);
            }
        }
        arrayList.add(new C29373OooO0O0(c29373OooO0O0.f104150OooO0O0, c29373OooO0O0.f104151OooO0OO, c29373OooO0O0.f104149OooO00o, DrawResult.copy$default(drawResult, 0, null, arrayList4, arrayList5, null, false, false, null, null, false, null, 2035, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO(AbstractC29372OooO00o abstractC29372OooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28897o00Ooo0O c28897o00Ooo0O;
        C33898OooO0Oo c33898OooO0Oo;
        C23344OooOOo c23344OooOOo;
        if (abstractC32479OooO0OO instanceof C28897o00Ooo0O) {
            c28897o00Ooo0O = (C28897o00Ooo0O) abstractC32479OooO0OO;
            int i = c28897o00Ooo0O.f102382OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28897o00Ooo0O.f102382OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c28897o00Ooo0O = new C28897o00Ooo0O(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28897o00Ooo0O.f102379OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28897o00Ooo0O.f102382OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c28897o00Ooo0O.f102378OooOo0o = this;
            c28897o00Ooo0O.f102377OooOo = abstractC29372OooO00o;
            c33898OooO0Oo = this.f73611o0Oo0oo;
            c28897o00Ooo0O.f102380OooOoO0 = c33898OooO0Oo;
            c28897o00Ooo0O.f102382OooOoo0 = 1;
            if (c33898OooO0Oo.OooO00o(c28897o00Ooo0O) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c23344OooOOo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C33898OooO0Oo c33898OooO0Oo2 = c28897o00Ooo0O.f102380OooOoO0;
            AbstractC29372OooO00o abstractC29372OooO00o2 = c28897o00Ooo0O.f102377OooOo;
            c23344OooOOo = c28897o00Ooo0O.f102378OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c33898OooO0Oo = c33898OooO0Oo2;
            abstractC29372OooO00o = abstractC29372OooO00o2;
        }
        try {
            ArrayList arrayListO0ooOoO = OooOo.o0ooOoO((Collection) c23344OooOOo.f73613o0ooOO0.getValue());
            if ((abstractC29372OooO00o instanceof C29373OooO0O0) && ((C29373OooO0O0) abstractC29372OooO00o).f104152OooO0Oo.getFromPixelEraser()) {
                OooOOO0((C29373OooO0O0) abstractC29372OooO00o, arrayListO0ooOoO);
            } else {
                arrayListO0ooOoO.add(abstractC29372OooO00o);
            }
            C33781o00o0O c33781o00o0O = c23344OooOOo.f73613o0ooOO0;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, arrayListO0ooOoO);
            C33781o00o0O c33781o00o0O2 = c23344OooOOo.f73615o0ooOoO;
            C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, c34434OooOoO);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            c33898OooO0Oo.OooOOO0(null);
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            c33898OooO0Oo.OooOOO0(null);
            throw th;
        }
    }

    @Override // androidx.lifecycle.AbstractC22019Ooooooo
    public final void OooO0OO() {
        C23346OooO0o0 c23346OooO0o0;
        o00000OO o00000oo2 = this.f73600OoooooO;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        }
        this.f73600OoooooO = null;
        C33898OooO0Oo c33898OooO0Oo = this.f73597OooooOo;
        if (c33898OooO0Oo.OooO0o0()) {
            try {
                c23346OooO0o0 = this.f73598Oooooo;
                this.f73598Oooooo = null;
            } finally {
                c33898OooO0Oo.OooOOO0(null);
            }
        } else {
            c23346OooO0o0 = null;
        }
        C33781o00o0O c33781o00o0O = this.f73588OoooOOO;
        this.f73557OooOOo.OooO00o((String) c33781o00o0O.getValue(), false, new WeakReference<>(this));
        String str = (String) c33781o00o0O.getValue();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new OooO0o(c23346OooO0o0, this, str, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28900o00OooO0 c28900o00OooO0;
        C23344OooOOo c23344OooOOo;
        C33898OooO0Oo c33898OooO0Oo;
        if (abstractC32479OooO0OO instanceof C28900o00OooO0) {
            c28900o00OooO0 = (C28900o00OooO0) abstractC32479OooO0OO;
            int i = c28900o00OooO0.f102399OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28900o00OooO0.f102399OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c28900o00OooO0 = new C28900o00OooO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28900o00OooO0.f102398OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28900o00OooO0.f102399OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c28900o00OooO0.f102396OooOo0o = this;
            C33898OooO0Oo c33898OooO0Oo2 = this.f73611o0Oo0oo;
            c28900o00OooO0.f102395OooOo = c33898OooO0Oo2;
            c28900o00OooO0.f102399OooOoOO = 1;
            if (c33898OooO0Oo2.OooO00o(c28900o00OooO0) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c23344OooOOo = this;
            c33898OooO0Oo = c33898OooO0Oo2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33898OooO0Oo = c28900o00OooO0.f102395OooOo;
            c23344OooOOo = c28900o00OooO0.f102396OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        try {
            C33781o00o0O c33781o00o0O = c23344OooOOo.f73613o0ooOO0;
            C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, c34434OooOoO);
            C33781o00o0O c33781o00o0O2 = c23344OooOOo.f73615o0ooOoO;
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, c34434OooOoO);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            c33898OooO0Oo.OooOOO0(null);
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            c33898OooO0Oo.OooOOO0(null);
            throw th;
        }
    }

    public final Object OooOO0O(File file, String str, String str2, AbstractC32476OooO abstractC32476OooO) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28904o00Ooooo(this, file, str, str2, null), abstractC32476OooO);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0o(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        oo00oO oo00oo;
        if (abstractC32479OooO0OO instanceof oo00oO) {
            oo00oo = (oo00oO) abstractC32479OooO0OO;
            int i = oo00oo.f102697OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oo00oo.f102697OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oo00oo = new oo00oO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = oo00oo.f102696OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oo00oo.f102697OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0o);
                String valueAsString = this.f73549OooO0oo.f95374OooO00o.getValueAsString("rconfig_estimator_config");
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o, "NoteEditorViewModel", "getEstimatorConfig, configJsonStr: ", valueAsString, "."), new Object[0]);
                OooOo00 oooOo00OooO00o = C34467OooOo0.OooO00o(new C28891o00OoOo0());
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
                C28907o00o00 c28907o00o00 = new C28907o00o00(oooOo00OooO00o, valueAsString, null);
                oo00oo.f102697OooOoO0 = 1;
                objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c28907o00o00, oo00oo);
                if (objOooO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0o);
            }
            return (List) objOooO0o;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("NoteEditorViewModel");
            c20358OooO00o2.OooO0Oo(e, "getEstimatorConfig, parse json error, return empty list.", new Object[0]);
            return C34434OooOoO.f123453OooOo0o;
        }
    }

    /* JADX WARN: Path cross not found for [B:41:0x010b, B:26:0x0099], limit reached: 47 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:36:0x00f9, B:43:0x011b, B:39:0x0102, B:26:0x0099, B:28:0x00a2, B:30:0x00bb, B:41:0x010b, B:25:0x007f), top: B:48:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:36:0x00f9, B:43:0x011b, B:39:0x0102, B:26:0x0099, B:28:0x00a2, B:30:0x00bb, B:41:0x010b, B:25:0x007f), top: B:48:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00f0 -> B:34:0x00f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00f7 -> B:36:0x00f9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO(OooOOO oooOOO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C23350OooOo0 c23350OooOo0;
        InterfaceC23345OooO0Oo interfaceC23345OooO0Oo;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        C23344OooOOo c23344OooOOo;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        List listO0ooOoO;
        C23344OooOOo c23344OooOOo2;
        List list;
        if (abstractC32479OooO0OO instanceof C23350OooOo0) {
            c23350OooOo0 = (C23350OooOo0) abstractC32479OooO0OO;
            int i = c23350OooOo0.f73665OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23350OooOo0.f73665OooOooo = i - Integer.MIN_VALUE;
            } else {
                c23350OooOo0 = new C23350OooOo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c23350OooOo0.f73662OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c23350OooOo0.f73665OooOooo;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteEditorViewModel");
                c20358OooO00o.OooO0o0("performRedo called", new Object[0]);
                c23350OooOo0.f73658OooOo0o = this;
                interfaceC23345OooO0Oo = oooOOO;
                c23350OooOo0.f73657OooOo = interfaceC23345OooO0Oo;
                interfaceC33895OooO00o = this.f73611o0Oo0oo;
                c23350OooOo0.f73660OooOoO0 = interfaceC33895OooO00o;
                c23350OooOo0.f73665OooOooo = 1;
                if (interfaceC33895OooO00o.OooO00o(c23350OooOo0) != enumC32485OooO00o) {
                    c23344OooOOo = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC29372OooO00o abstractC29372OooO00o = c23350OooOo0.f73663OooOoo0;
                listO0ooOoO = c23350OooOo0.f73661OooOoOO;
                list = c23350OooOo0.f73659OooOoO;
                interfaceC33895OooO00o2 = c23350OooOo0.f73660OooOoO0;
                InterfaceC23345OooO0Oo interfaceC23345OooO0Oo2 = c23350OooOo0.f73657OooOo;
                C23344OooOOo c23344OooOOo3 = c23350OooOo0.f73658OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC23345OooO0Oo = interfaceC23345OooO0Oo2;
                c23344OooOOo2 = c23344OooOOo3;
                if (abstractC29372OooO00o.f104149OooO00o.length() != 0) {
                    if (!listO0ooOoO.isEmpty()) {
                        if (OooOOO0.OooO0O0(abstractC29372OooO00o.f104149OooO00o, ((AbstractC29372OooO00o) OooOo.OoooOOo(listO0ooOoO)).f104149OooO00o)) {
                        }
                    }
                    if (!listO0ooOoO.isEmpty()) {
                        abstractC29372OooO00o = (AbstractC29372OooO00o) listO0ooOoO.remove(listO0ooOoO.size() - 1);
                        interfaceC23345OooO0Oo.OooO00o(abstractC29372OooO00o);
                        list.add(abstractC29372OooO00o.OooO00o());
                        if (abstractC29372OooO00o instanceof C29373OooO0O0) {
                            String str = ((C29373OooO0O0) abstractC29372OooO00o).f104151OooO0OO;
                            List<InterfaceC31284OooO0O0> newItemList = ((C29373OooO0O0) abstractC29372OooO00o).f104152OooO0Oo.getNewItemList();
                            List<InterfaceC31284OooO0O0> removeItemList = ((C29373OooO0O0) abstractC29372OooO00o).f104152OooO0Oo.getRemoveItemList();
                            c23350OooOo0.f73658OooOo0o = c23344OooOOo2;
                            c23350OooOo0.f73657OooOo = interfaceC23345OooO0Oo;
                            c23350OooOo0.f73660OooOoO0 = interfaceC33895OooO00o2;
                            c23350OooOo0.f73659OooOoO = list;
                            c23350OooOo0.f73661OooOoOO = listO0ooOoO;
                            c23350OooOo0.f73663OooOoo0 = abstractC29372OooO00o;
                            c23350OooOo0.f73665OooOooo = 2;
                            C23350OooOo0 c23350OooOo02 = c23350OooOo0;
                            if (c23344OooOOo2.OooOo0(str, newItemList, removeItemList, false, c23350OooOo02) != enumC32485OooO00o) {
                                c23344OooOOo3 = c23344OooOOo2;
                                c23350OooOo0 = c23350OooOo02;
                                interfaceC23345OooO0Oo2 = interfaceC23345OooO0Oo;
                                interfaceC23345OooO0Oo = interfaceC23345OooO0Oo2;
                                c23344OooOOo2 = c23344OooOOo3;
                                if (abstractC29372OooO00o.f104149OooO00o.length() != 0) {
                                }
                            }
                            return enumC32485OooO00o;
                        }
                        if (abstractC29372OooO00o.f104149OooO00o.length() != 0) {
                        }
                    }
                }
                c23344OooOOo2.f73613o0ooOO0.setValue(list);
                c23344OooOOo2.f73615o0ooOoO.setValue(listO0ooOoO);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            }
            interfaceC33895OooO00o = c23350OooOo0.f73660OooOoO0;
            InterfaceC23345OooO0Oo interfaceC23345OooO0Oo3 = c23350OooOo0.f73657OooOo;
            c23344OooOOo = c23350OooOo0.f73658OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC23345OooO0Oo = interfaceC23345OooO0Oo3;
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            ArrayList arrayListO0ooOoO = OooOo.o0ooOoO((Collection) c23344OooOOo.f73613o0ooOO0.getValue());
            listO0ooOoO = OooOo.o0ooOoO((Collection) c23344OooOOo.f73615o0ooOoO.getValue());
            c23344OooOOo2 = c23344OooOOo;
            list = arrayListO0ooOoO;
            if (!listO0ooOoO.isEmpty()) {
            }
            c23344OooOOo2.f73613o0ooOO0.setValue(list);
            c23344OooOOo2.f73615o0ooOoO.setValue(listO0ooOoO);
            C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
            interfaceC33895OooO00o2.OooOOO0(null);
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:36:0x0102, B:85:0x018d, B:39:0x010a, B:41:0x0113, B:43:0x011d, B:46:0x0123, B:48:0x0127, B:50:0x012d, B:53:0x0137, B:55:0x013d, B:57:0x0141, B:60:0x0148, B:62:0x014c, B:64:0x0152, B:66:0x015a, B:68:0x0160, B:70:0x0164, B:73:0x016e, B:76:0x0175, B:80:0x017e, B:26:0x009c, B:28:0x00a5, B:30:0x00c1, B:25:0x0081), top: B:90:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:36:0x0102, B:85:0x018d, B:39:0x010a, B:41:0x0113, B:43:0x011d, B:46:0x0123, B:48:0x0127, B:50:0x012d, B:53:0x0137, B:55:0x013d, B:57:0x0141, B:60:0x0148, B:62:0x014c, B:64:0x0152, B:66:0x015a, B:68:0x0160, B:70:0x0164, B:73:0x016e, B:76:0x0175, B:80:0x017e, B:26:0x009c, B:28:0x00a5, B:30:0x00c1, B:25:0x0081), top: B:90:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00f9 -> B:34:0x00fd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0100 -> B:36:0x0102). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOOO(OooOOOO oooOOOO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C23351OooOo0O c23351OooOo0O;
        InterfaceC23345OooO0Oo interfaceC23345OooO0Oo;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        C23344OooOOo c23344OooOOo;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        List listO0ooOoO;
        C23344OooOOo c23344OooOOo2;
        List listO0ooOoO2;
        DrawResult drawResult;
        List<InterfaceC31284OooO0O0> newItemList;
        InterfaceC31284OooO0O0 interfaceC31284OooO0O0;
        DrawResult drawResult2;
        List<InterfaceC31284OooO0O0> removeItemList;
        if (abstractC32479OooO0OO instanceof C23351OooOo0O) {
            c23351OooOo0O = (C23351OooOo0O) abstractC32479OooO0OO;
            int i = c23351OooOo0O.f73677Oooo000;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23351OooOo0O.f73677Oooo000 = i - Integer.MIN_VALUE;
            } else {
                c23351OooOo0O = new C23351OooOo0O(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c23351OooOo0O.f73675OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c23351OooOo0O.f73677Oooo000;
        int i3 = 2;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteEditorViewModel");
                c20358OooO00o.OooO0o0("performUndo called", new Object[0]);
                c23351OooOo0O.f73669OooOo0o = this;
                interfaceC23345OooO0Oo = oooOOOO;
                c23351OooOo0O.f73668OooOo = interfaceC23345OooO0Oo;
                interfaceC33895OooO00o = this.f73611o0Oo0oo;
                c23351OooOo0O.f73671OooOoO0 = interfaceC33895OooO00o;
                c23351OooOo0O.f73677Oooo000 = 1;
                if (interfaceC33895OooO00o.OooO00o(c23351OooOo0O) != enumC32485OooO00o) {
                    c23344OooOOo = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str = c23351OooOo0O.f73673OooOoo;
                AbstractC29372OooO00o abstractC29372OooO00o = c23351OooOo0O.f73674OooOoo0;
                listO0ooOoO2 = c23351OooOo0O.f73672OooOoOO;
                listO0ooOoO = c23351OooOo0O.f73670OooOoO;
                interfaceC33895OooO00o2 = c23351OooOo0O.f73671OooOoO0;
                InterfaceC23345OooO0Oo interfaceC23345OooO0Oo2 = c23351OooOo0O.f73668OooOo;
                C23344OooOOo c23344OooOOo3 = c23351OooOo0O.f73669OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC23345OooO0Oo = interfaceC23345OooO0Oo2;
                c23344OooOOo2 = c23344OooOOo3;
                if (str.length() != 0) {
                    if (!listO0ooOoO.isEmpty()) {
                        AbstractC29372OooO00o abstractC29372OooO00o2 = (AbstractC29372OooO00o) OooOo.OoooOOo(listO0ooOoO);
                        C29373OooO0O0 c29373OooO0O0 = abstractC29372OooO00o instanceof C29373OooO0O0 ? (C29373OooO0O0) abstractC29372OooO00o : null;
                        InterfaceC31284OooO0O0 interfaceC31284OooO0O02 = (c29373OooO0O0 == null || (drawResult2 = c29373OooO0O0.f104152OooO0Oo) == null || (removeItemList = drawResult2.getRemoveItemList()) == null) ? null : (InterfaceC31284OooO0O0) OooOo.Oooo(removeItemList);
                        String id = interfaceC31284OooO0O02 != null ? interfaceC31284OooO0O02.getId() : null;
                        C29373OooO0O0 c29373OooO0O02 = abstractC29372OooO00o2 instanceof C29373OooO0O0 ? (C29373OooO0O0) abstractC29372OooO00o2 : null;
                        boolean z = (interfaceC31284OooO0O02 instanceof ShapeInfo) && ((ShapeInfo) interfaceC31284OooO0O02).getTapeLike() && id != null && id.length() != 0 && id.equals((c29373OooO0O02 == null || (drawResult = c29373OooO0O02.f104152OooO0Oo) == null || (newItemList = drawResult.getNewItemList()) == null || (interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) OooOo.Oooo(newItemList)) == null) ? null : interfaceC31284OooO0O0.getId());
                        if (!str.equals(abstractC29372OooO00o2.f104149OooO00o) && !z) {
                        }
                    }
                    i3 = 2;
                    if (!listO0ooOoO.isEmpty()) {
                        abstractC29372OooO00o = (AbstractC29372OooO00o) listO0ooOoO.remove(listO0ooOoO.size() - 1);
                        str = abstractC29372OooO00o.f104149OooO00o;
                        interfaceC23345OooO0Oo.OooO0O0(abstractC29372OooO00o);
                        listO0ooOoO2.add(abstractC29372OooO00o.OooO00o());
                        if (abstractC29372OooO00o instanceof C29373OooO0O0) {
                            String str2 = ((C29373OooO0O0) abstractC29372OooO00o).f104151OooO0OO;
                            List<InterfaceC31284OooO0O0> removeItemList2 = ((C29373OooO0O0) abstractC29372OooO00o).f104152OooO0Oo.getRemoveItemList();
                            List<InterfaceC31284OooO0O0> newItemList2 = ((C29373OooO0O0) abstractC29372OooO00o).f104152OooO0Oo.getNewItemList();
                            c23351OooOo0O.f73669OooOo0o = c23344OooOOo2;
                            c23351OooOo0O.f73668OooOo = interfaceC23345OooO0Oo;
                            c23351OooOo0O.f73671OooOoO0 = interfaceC33895OooO00o2;
                            c23351OooOo0O.f73670OooOoO = listO0ooOoO;
                            c23351OooOo0O.f73672OooOoOO = listO0ooOoO2;
                            c23351OooOo0O.f73674OooOoo0 = abstractC29372OooO00o;
                            c23351OooOo0O.f73673OooOoo = str;
                            c23351OooOo0O.f73677Oooo000 = i3;
                            C23351OooOo0O c23351OooOo0O2 = c23351OooOo0O;
                            if (c23344OooOOo2.OooOo0(str2, removeItemList2, newItemList2, true, c23351OooOo0O2) != enumC32485OooO00o) {
                                c23344OooOOo3 = c23344OooOOo2;
                                c23351OooOo0O = c23351OooOo0O2;
                                interfaceC23345OooO0Oo2 = interfaceC23345OooO0Oo;
                                interfaceC23345OooO0Oo = interfaceC23345OooO0Oo2;
                                c23344OooOOo2 = c23344OooOOo3;
                                if (str.length() != 0) {
                                }
                            }
                            return enumC32485OooO00o;
                        }
                        if (str.length() != 0) {
                        }
                    }
                }
                c23344OooOOo2.f73613o0ooOO0.setValue(listO0ooOoO);
                c23344OooOOo2.f73615o0ooOoO.setValue(listO0ooOoO2);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            }
            interfaceC33895OooO00o = c23351OooOo0O.f73671OooOoO0;
            InterfaceC23345OooO0Oo interfaceC23345OooO0Oo3 = c23351OooOo0O.f73668OooOo;
            c23344OooOOo = c23351OooOo0O.f73669OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC23345OooO0Oo = interfaceC23345OooO0Oo3;
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            listO0ooOoO = OooOo.o0ooOoO((Collection) c23344OooOOo.f73613o0ooOO0.getValue());
            c23344OooOOo2 = c23344OooOOo;
            listO0ooOoO2 = OooOo.o0ooOoO((Collection) c23344OooOOo.f73615o0ooOoO.getValue());
            if (!listO0ooOoO.isEmpty()) {
            }
            c23344OooOOo2.f73613o0ooOO0.setValue(listO0ooOoO);
            c23344OooOOo2.f73615o0ooOoO.setValue(listO0ooOoO2);
            C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
            interfaceC33895OooO00o2.OooOOO0(null);
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }

    public final String OooOOOo(Bitmap bitmap, String dstNoteId, String str) {
        OooOOO0.OooO0oO(bitmap, "bitmap");
        OooOOO0.OooO0oO(dstNoteId, "dstNoteId");
        C27449o00O0OoO c27449o00O0OoO = this.f73545OooO0Oo;
        c27449o00O0OoO.getClass();
        File fileOooOO0 = c27449o00O0OoO.f96047OooOOO0.OooOO0(dstNoteId, str, false);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C23347OooO0oO(bitmap, fileOooOO0, null), 2);
        String path = fileOooOO0.getPath();
        OooOOO0.OooO0o(path, "getPath(...)");
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOo(Uri uri, String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28936o00o0oOO c28936o00o0oOO;
        if (abstractC32479OooO0OO instanceof C28936o00o0oOO) {
            c28936o00o0oOO = (C28936o00o0oOO) abstractC32479OooO0OO;
            int i = c28936o00o0oOO.f102521OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28936o00o0oOO.f102521OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c28936o00o0oOO = new C28936o00o0oOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c28936o00o0oOO.f102520OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28936o00o0oOO.f102521OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C28937o00o0oOo c28937o00o0oOo = new C28937o00o0oOo(this, str, str2, uri, null);
            c28936o00o0oOO.f102521OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c28937o00o0oOo, c28936o00o0oOO);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        OooOOO0.OooO0o(objOooO0o, "withContext(...)");
        return objOooO0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOo0(Bitmap bitmap, String dstNoteId, String dstImageId, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28935o00o0oO0 c28935o00o0oO0;
        File file;
        if (abstractC32479OooO0OO instanceof C28935o00o0oO0) {
            c28935o00o0oO0 = (C28935o00o0oO0) abstractC32479OooO0OO;
            int i = c28935o00o0oO0.f102517OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28935o00o0oO0.f102517OooOoO = i - Integer.MIN_VALUE;
            } else {
                c28935o00o0oO0 = new C28935o00o0oO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28935o00o0oO0.f102515OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28935o00o0oO0.f102517OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27449o00O0OoO c27449o00O0OoO = this.f73545OooO0Oo;
            c27449o00O0OoO.getClass();
            OooOOO0.OooO0oO(dstNoteId, "dstNoteId");
            OooOOO0.OooO0oO(dstImageId, "dstImageId");
            File fileOooOO0 = c27449o00O0OoO.f96047OooOOO0.OooOO0(dstNoteId, dstImageId, false);
            String absolutePath = fileOooOO0.getAbsolutePath();
            OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
            c28935o00o0oO0.f102516OooOo0o = fileOooOO0;
            c28935o00o0oO0.f102517OooOoO = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            if (C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27602oOooo0o(c27449o00O0OoO, bitmap, absolutePath, null), c28935o00o0oO0) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            file = fileOooOO0;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = c28935o00o0oO0.f102516OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        String path = file.getPath();
        OooOOO0.OooO0o(path, "getPath(...)");
        return path;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOoo(String str, DrawResult result, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28942o00oO000 c28942o00oO000;
        Object objOooO0o;
        if (abstractC32479OooO0OO instanceof C28942o00oO000) {
            c28942o00oO000 = (C28942o00oO000) abstractC32479OooO0OO;
            int i = c28942o00oO000.f102543OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28942o00oO000.f102543OooOoO = i - Integer.MIN_VALUE;
            } else {
                c28942o00oO000 = new C28942o00oO000(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28942o00oO000.f102541OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28942o00oO000.f102543OooOoO;
        boolean z = true;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c28942o00oO000.f102542OooOo0o = result;
            c28942o00oO000.f102543OooOoO = 1;
            List<Page> pages = ((NoteContent) this.f73592OoooOoo.f121747OooOo0o.getValue()).getPages();
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
            Iterator<T> it = pages.iterator();
            while (it.hasNext()) {
                arrayList.add(((Page) it.next()).getId());
            }
            if (OooOOO0.OooO0O0(OooOo.OoooOo0(arrayList), str)) {
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28917o00o00oo(this, null), c28942o00oO000);
            } else {
                objOooO0o = Boolean.FALSE;
            }
            obj = objOooO0o;
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            result = c28942o00oO000.f102542OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            return Boolean.FALSE;
        }
        List<InterfaceC32507OooOO0o<DrawResult, Boolean>> strategies = C28687OooO0OO.f101643OooO00o;
        OooOOO0.OooO0oO(result, "result");
        OooOOO0.OooO0oO(strategies, "strategies");
        List<InterfaceC32507OooOO0o<DrawResult, Boolean>> list = strategies;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!((Boolean) ((InterfaceC32507OooOO0o) it2.next()).invoke(result)).booleanValue()) {
                    z = false;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object OooOo0(String str, List list, List list2, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28956o00oOo00(list, list2, this, str, z, null), abstractC32479OooO0OO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOo00(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28951o00oOOOo c28951o00oOOOo;
        if (abstractC32479OooO0OO instanceof C28951o00oOOOo) {
            c28951o00oOOOo = (C28951o00oOOOo) abstractC32479OooO0OO;
            int i = c28951o00oOOOo.f102579OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28951o00oOOOo.f102579OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c28951o00oOOOo = new C28951o00oOOOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c28951o00oOOOo.f102578OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28951o00oOOOo.f102579OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c28951o00oOOOo.f102579OooOoO0 = 1;
            objOooO00o = this.f73561OooOo0.f94327OooO00o.OooO00o(str, c28951o00oOOOo);
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        return (TranslateResult) objOooO00o;
    }

    public final Object OooOo0O(ArrayList arrayList, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28965o00oOooO(this, arrayList, null), abstractC32479OooO0OO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }
}
