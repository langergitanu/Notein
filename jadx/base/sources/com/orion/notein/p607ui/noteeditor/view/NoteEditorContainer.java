package com.orion.notein.p607ui.noteeditor.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.PersistableBundle;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.PersistableBundleKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.orion.notein.domain.models.DragConstants;
import com.orion.notein.global.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0Oo00oO.C28038OooO0Oo;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o00.ViewOnClickListenerC28157OooOO0O;
import o0Oo0o00.ViewOnClickListenerC28158OooOO0o;
import o0OoOO00.ViewOnClickListenerC29029OoooO00;
import o0Oooo0.ViewOnClickListenerC29610OooO00o;
import oO00ooO.C32443OooOOO;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018J\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR*\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/view/NoteEditorContainer;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "getScreenIndicatorBias", "()Ljava/lang/Float;", "", "editorIndex", "LoO00ooO/OooOooO;", "setFocusedEditorIndex", "(I)V", "Lcom/orion/notein/ui/noteeditor/view/NoteEditorContainer$OooO00o;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setEditorContainerEventListener", "(Lcom/orion/notein/ui/noteeditor/view/NoteEditorContainer$OooO00o;)V", "value", "Oooo0o0", "I", "getLayoutType", "()I", "getLayoutType$annotations", "()V", "layoutType", "OooO0OO", "OooO0O0", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NoteEditorContainer extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final List<Integer> f76968Oooo0o = C34429OooOOo0.OooOO0o(Integer.valueOf(R.id.note_editor_fragment_1), Integer.valueOf(R.id.note_editor_fragment_2));

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public View f76969OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public View f76970OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public View f76971OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public List<? extends View> f76972OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public View f76973OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public View f76974OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public View f76975OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f76976OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public View f76977OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f76978Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f76979Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f76980Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final PointF f76981Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f76982Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public OooO00o f76983Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name and from kotlin metadata */
    public int layoutType;

    public interface OooO00o {
        void OooO00o(Integer num);

        void OooO0O0();

        void OooO0OO(int i);

        void OooO0Oo();

        void OooO0o(View view, DragEvent dragEvent);

        void OooO0o0(int i, Integer num, boolean z);

        void OooO0oO();

        void OooO0oo();
    }

    public final class OooO0O0 implements View.OnDragListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f76985OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Integer f76986OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f76987OooO0OO = -1;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f76988OooO0Oo = -1;

        public OooO0O0() {
        }

        /* JADX WARN: Removed duplicated region for block: B:141:0x02b6  */
        @Override // android.view.View.OnDragListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onDrag(View v, DragEvent event) {
            OooO00o oooO00o;
            boolean z;
            Integer numOooO00o;
            PersistableBundle extras;
            OooOOO0.OooO0oO(v, "v");
            OooOOO0.OooO0oO(event, "event");
            int action = event.getAction();
            NoteEditorContainer noteEditorContainer = NoteEditorContainer.this;
            if (action == 1) {
                Integer numOooO00o2 = NoteEditorContainer.OooO00o(noteEditorContainer, event.getX(), event.getY());
                this.f76988OooO0Oo = numOooO00o2 != null ? numOooO00o2.intValue() : -1;
            }
            if (event.getAction() == 1 || event.getAction() == 5) {
                this.f76985OooO00o = false;
            }
            if (event.getAction() == 3) {
                this.f76985OooO00o = true;
            }
            if (event.getAction() == 1) {
                this.f76987OooO0OO = -1;
                this.f76986OooO0O0 = Integer.valueOf(noteEditorContainer.getLayoutType());
                noteEditorContainer.f76982Oooo0O0 = -1;
                noteEditorContainer.OooO0OO();
            }
            Integer num = this.f76986OooO0O0;
            boolean z2 = num == null || num.intValue() != 0;
            if (event.getAction() == 4 || event.getAction() == 6) {
                this.f76987OooO0OO = -1;
                if (!this.f76985OooO00o && (oooO00o = noteEditorContainer.f76983Oooo0OO) != null) {
                    oooO00o.OooO0o0(-1, this.f76986OooO0O0, z2);
                }
                noteEditorContainer.f76982Oooo0O0 = -1;
                noteEditorContainer.OooO0OO();
            }
            ClipDescription clipDescription = event.getClipDescription();
            CharSequence label = clipDescription != null ? clipDescription.getLabel() : null;
            ClipDescription clipDescription2 = event.getClipDescription();
            Integer numValueOf = (clipDescription2 == null || (extras = clipDescription2.getExtras()) == null) ? null : Integer.valueOf(extras.getInt(DragConstants.NOTEIN_DRAG_DATA_TYPE, -1));
            if (!OooOOO0.OooO0O0(label, DragConstants.NOTEIN_DRAG_LABEL) || numValueOf == null || numValueOf.intValue() != 4 || event.getAction() != 2) {
                if (event.getAction() == 2 || event.getAction() == 3) {
                    z = true;
                }
                numOooO00o = NoteEditorContainer.OooO00o(noteEditorContainer, event.getX(), event.getY());
                if (z && numOooO00o != null) {
                    noteEditorContainer.setFocusedEditorIndex(numOooO00o.intValue());
                }
                if (event.getAction() == 3) {
                    ClipData clipData = event.getClipData();
                    if ((clipData != null ? clipData.getItemCount() : 0) != 0) {
                        ClipData clipData2 = event.getClipData();
                        ClipDescription description = clipData2 != null ? clipData2.getDescription() : null;
                        if (description != null && numOooO00o != null) {
                            if (description.getExtras() != null) {
                                PersistableBundle extras2 = description.getExtras();
                                if (extras2 != null) {
                                    extras2.putInt("drag_index", this.f76988OooO0Oo);
                                    extras2.putInt("drop_index", numOooO00o.intValue());
                                }
                            } else {
                                description.setExtras(PersistableBundleKt.persistableBundleOf(new C32443OooOOO("drag_index", Integer.valueOf(this.f76988OooO0Oo)), new C32443OooOOO("drop_index", numOooO00o)));
                            }
                            OooO00o oooO00o2 = noteEditorContainer.f76983Oooo0OO;
                            if (oooO00o2 != null) {
                                oooO00o2.OooO0o(v, event);
                            }
                        }
                    }
                }
                return true;
            }
            if (noteEditorContainer.getLayoutType() == 0) {
                noteEditorContainer.f76982Oooo0O0 = 0;
                noteEditorContainer.OooO0OO();
                Context context = noteEditorContainer.getContext();
                OooOOO0.OooO0o(context, "getContext(...)");
                if (!C28038OooO0Oo.OooO0O0(context)) {
                    this.f76987OooO0OO = 0;
                    OooO00o oooO00o3 = noteEditorContainer.f76983Oooo0OO;
                    if (oooO00o3 != null) {
                        oooO00o3.OooO0o0(0, null, z2);
                    }
                }
            } else {
                RectF rectF = new RectF(0.0f, noteEditorContainer.getHeight() * 0.25f, noteEditorContainer.getWidth() * 0.125f, noteEditorContainer.getHeight() * 0.75f);
                if (this.f76987OooO0OO == 0 || !rectF.contains(event.getX(), event.getY())) {
                    RectF rectF2 = new RectF(noteEditorContainer.getWidth() * 0.25f, 0.0f, noteEditorContainer.getWidth() * 0.75f, noteEditorContainer.getHeight() * 0.125f);
                    if (this.f76987OooO0OO == 1 || !rectF2.contains(event.getX(), event.getY())) {
                        RectF rectF3 = new RectF(noteEditorContainer.getWidth() * 0.875f, noteEditorContainer.getHeight() * 0.25f, noteEditorContainer.getWidth(), noteEditorContainer.getHeight() * 0.75f);
                        if (this.f76987OooO0OO == 2 || !rectF3.contains(event.getX(), event.getY())) {
                            RectF rectF4 = new RectF(noteEditorContainer.getWidth() * 0.25f, noteEditorContainer.getHeight() * 0.825f, noteEditorContainer.getWidth() * 0.75f, noteEditorContainer.getHeight());
                            if (this.f76987OooO0OO != 3 && rectF4.contains(event.getX(), event.getY())) {
                                this.f76987OooO0OO = 3;
                                noteEditorContainer.f76982Oooo0O0 = 1;
                                noteEditorContainer.OooO0OO();
                                OooO00o oooO00o4 = noteEditorContainer.f76983Oooo0OO;
                                if (oooO00o4 != null) {
                                    oooO00o4.OooO0o0(3, null, z2);
                                }
                            } else if (noteEditorContainer.getLayoutType() == 2) {
                                int i = event.getX() < (((float) noteEditorContainer.getWidth()) / 2.0f) + noteEditorContainer.getX() ? 0 : 1;
                                if (i == 0 && this.f76987OooO0OO != 0) {
                                    noteEditorContainer.f76982Oooo0O0 = i;
                                    noteEditorContainer.OooO0OO();
                                    this.f76987OooO0OO = 0;
                                    OooO00o oooO00o5 = noteEditorContainer.f76983Oooo0OO;
                                    if (oooO00o5 != null) {
                                        oooO00o5.OooO0o0(0, null, z2);
                                    }
                                } else if (i == 1 && this.f76987OooO0OO != 2) {
                                    noteEditorContainer.f76982Oooo0O0 = i;
                                    noteEditorContainer.OooO0OO();
                                    this.f76987OooO0OO = 2;
                                    OooO00o oooO00o6 = noteEditorContainer.f76983Oooo0OO;
                                    if (oooO00o6 != null) {
                                        oooO00o6.OooO0o0(2, null, z2);
                                    }
                                }
                            } else if (noteEditorContainer.getLayoutType() == 1) {
                                int i2 = event.getY() < (((float) noteEditorContainer.getHeight()) / 2.0f) + noteEditorContainer.getY() ? 0 : 1;
                                if (i2 == 0 && this.f76987OooO0OO != 1) {
                                    noteEditorContainer.f76982Oooo0O0 = i2;
                                    noteEditorContainer.OooO0OO();
                                    this.f76987OooO0OO = 1;
                                    OooO00o oooO00o7 = noteEditorContainer.f76983Oooo0OO;
                                    if (oooO00o7 != null) {
                                        oooO00o7.OooO0o0(1, null, z2);
                                    }
                                } else if (i2 == 1 && this.f76987OooO0OO != 3) {
                                    noteEditorContainer.f76982Oooo0O0 = i2;
                                    noteEditorContainer.OooO0OO();
                                    this.f76987OooO0OO = 3;
                                    OooO00o oooO00o8 = noteEditorContainer.f76983Oooo0OO;
                                    if (oooO00o8 != null) {
                                        oooO00o8.OooO0o0(3, null, z2);
                                    }
                                }
                            }
                        } else {
                            this.f76987OooO0OO = 2;
                            noteEditorContainer.f76982Oooo0O0 = 1;
                            noteEditorContainer.OooO0OO();
                            OooO00o oooO00o9 = noteEditorContainer.f76983Oooo0OO;
                            if (oooO00o9 != null) {
                                oooO00o9.OooO0o0(2, null, z2);
                            }
                        }
                    } else {
                        this.f76987OooO0OO = 1;
                        noteEditorContainer.f76982Oooo0O0 = 0;
                        noteEditorContainer.OooO0OO();
                        OooO00o oooO00o10 = noteEditorContainer.f76983Oooo0OO;
                        if (oooO00o10 != null) {
                            oooO00o10.OooO0o0(1, null, z2);
                        }
                    }
                } else {
                    this.f76987OooO0OO = 0;
                    noteEditorContainer.f76982Oooo0O0 = 0;
                    noteEditorContainer.OooO0OO();
                    OooO00o oooO00o11 = noteEditorContainer.f76983Oooo0OO;
                    if (oooO00o11 != null) {
                        oooO00o11.OooO0o0(0, null, z2);
                    }
                }
            }
            z = false;
            numOooO00o = NoteEditorContainer.OooO00o(noteEditorContainer, event.getX(), event.getY());
            if (z) {
                noteEditorContainer.setFocusedEditorIndex(numOooO00o.intValue());
            }
            if (event.getAction() == 3) {
            }
            return true;
        }
    }

    public final class OooO0OO implements View.OnTouchListener {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f76991OooOo0o = -1;

        public OooO0OO() {
        }

        public final void OooO00o(View view, int i, int i2) {
            NoteEditorContainer noteEditorContainer = NoteEditorContainer.this;
            float width = noteEditorContainer.getWidth();
            float height = noteEditorContainer.getHeight();
            androidx.constraintlayout.widget.OooO0OO oooO0OO = new androidx.constraintlayout.widget.OooO0OO();
            oooO0OO.OooO0o0(noteEditorContainer);
            int id = view.getId();
            View view2 = noteEditorContainer.f76971OooOoO;
            if (view2 == null) {
                OooOOO0.OooOOOO("dividerV");
                throw null;
            }
            if (id == view2.getId()) {
                float f = i / width;
                View view3 = noteEditorContainer.f76971OooOoO;
                if (view3 == null) {
                    OooOOO0.OooOOOO("dividerV");
                    throw null;
                }
                float f2 = f + oooO0OO.OooOO0O(view3.getId()).f64014OooO0o0.f64049OooOo;
                View view4 = noteEditorContainer.f76971OooOoO;
                if (view4 == null) {
                    OooOOO0.OooOOOO("dividerV");
                    throw null;
                }
                oooO0OO.OooOO0(view4.getId()).f64014OooO0o0.f64049OooOo = f2;
                this.f76991OooOo0o = -1;
                if (f2 < 0.2f) {
                    View view5 = noteEditorContainer.f76970OooOo0o;
                    if (view5 == null) {
                        OooOOO0.OooOOOO("editorA");
                        throw null;
                    }
                    oooO0OO.OooOOo(view5.getId(), Math.max(0.0f, f2 / 0.2f));
                    this.f76991OooOo0o = 1;
                } else {
                    View view6 = noteEditorContainer.f76970OooOo0o;
                    if (view6 == null) {
                        OooOOO0.OooOOOO("editorA");
                        throw null;
                    }
                    oooO0OO.OooOOo(view6.getId(), 1.0f);
                }
                if (f2 > 0.8f) {
                    float f3 = (1 - f2) / 0.19999999f;
                    View view7 = noteEditorContainer.f76969OooOo;
                    if (view7 == null) {
                        OooOOO0.OooOOOO("editorB");
                        throw null;
                    }
                    oooO0OO.OooOOo(view7.getId(), Math.max(0.0f, f3));
                    this.f76991OooOo0o = 0;
                } else {
                    View view8 = noteEditorContainer.f76969OooOo;
                    if (view8 == null) {
                        OooOOO0.OooOOOO("editorB");
                        throw null;
                    }
                    oooO0OO.OooOOo(view8.getId(), 1.0f);
                }
            } else {
                float f4 = i2 / height;
                View view9 = noteEditorContainer.f76976OooOooO;
                if (view9 == null) {
                    OooOOO0.OooOOOO("dividerH");
                    throw null;
                }
                float f5 = f4 + oooO0OO.OooOO0O(view9.getId()).f64014OooO0o0.f64055OooOoO0;
                View view10 = noteEditorContainer.f76976OooOooO;
                if (view10 == null) {
                    OooOOO0.OooOOOO("dividerH");
                    throw null;
                }
                oooO0OO.OooOO0(view10.getId()).f64014OooO0o0.f64055OooOoO0 = f5;
                this.f76991OooOo0o = -1;
                if (f5 < 0.2f) {
                    View view11 = noteEditorContainer.f76970OooOo0o;
                    if (view11 == null) {
                        OooOOO0.OooOOOO("editorA");
                        throw null;
                    }
                    oooO0OO.OooOOo(view11.getId(), Math.max(0.0f, f5 / 0.2f));
                    this.f76991OooOo0o = 1;
                } else {
                    View view12 = noteEditorContainer.f76970OooOo0o;
                    if (view12 == null) {
                        OooOOO0.OooOOOO("editorA");
                        throw null;
                    }
                    oooO0OO.OooOOo(view12.getId(), 1.0f);
                }
                if (f5 > 0.8f) {
                    float f6 = (1 - f5) / 0.19999999f;
                    View view13 = noteEditorContainer.f76969OooOo;
                    if (view13 == null) {
                        OooOOO0.OooOOOO("editorB");
                        throw null;
                    }
                    oooO0OO.OooOOo(view13.getId(), Math.max(0.0f, f6));
                    this.f76991OooOo0o = 0;
                } else {
                    View view14 = noteEditorContainer.f76969OooOo;
                    if (view14 == null) {
                        OooOOO0.OooOOOO("editorB");
                        throw null;
                    }
                    oooO0OO.OooOOo(view14.getId(), 1.0f);
                }
            }
            oooO0OO.OooO0O0(noteEditorContainer);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onTouch(View v, MotionEvent event) {
            OooO00o oooO00o;
            OooOOO0.OooO0oO(v, "v");
            OooOOO0.OooO0oO(event, "event");
            int action = event.getAction();
            NoteEditorContainer noteEditorContainer = NoteEditorContainer.this;
            PointF pointF = noteEditorContainer.f76981Oooo00o;
            if (action == 0) {
                OooO00o oooO00o2 = noteEditorContainer.f76983Oooo0OO;
                if (oooO00o2 != null) {
                    oooO00o2.OooO0O0();
                }
                noteEditorContainer.requestDisallowInterceptTouchEvent(true);
                pointF.set(event.getRawX(), event.getRawY());
                return true;
            }
            if (action == 1) {
                OooO00o oooO00o3 = noteEditorContainer.f76983Oooo0OO;
                if (oooO00o3 != null) {
                    oooO00o3.OooO0oo();
                }
                noteEditorContainer.requestDisallowInterceptTouchEvent(false);
                int i = this.f76991OooOo0o;
                if (i >= 0 && i < NoteEditorContainer.f76968Oooo0o.size() && (oooO00o = noteEditorContainer.f76983Oooo0OO) != null) {
                    oooO00o.OooO00o(Integer.valueOf(i));
                }
            } else {
                if (action == 2) {
                    int id = v.getId();
                    View view = noteEditorContainer.f76973OooOoOO;
                    if (view == null) {
                        OooOOO0.OooOOOO("dragIndicatorV");
                        throw null;
                    }
                    if (id == view.getId()) {
                        View view2 = noteEditorContainer.f76971OooOoO;
                        if (view2 == null) {
                            OooOOO0.OooOOOO("dividerV");
                            throw null;
                        }
                        OooO00o(view2, (int) (event.getRawX() - pointF.x), 0);
                    } else {
                        View view3 = noteEditorContainer.f76976OooOooO;
                        if (view3 == null) {
                            OooOOO0.OooOOOO("dividerH");
                            throw null;
                        }
                        OooO00o(view3, 0, (int) (event.getRawY() - pointF.y));
                    }
                    pointF.set(event.getRawX(), event.getRawY());
                    return true;
                }
                if (action == 3) {
                }
            }
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteEditorContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f76981Oooo00o = new PointF();
        this.f76982Oooo0O0 = -1;
    }

    public static final Integer OooO00o(NoteEditorContainer noteEditorContainer, float f, float f2) {
        List<? extends View> list = noteEditorContainer.f76972OooOoO0;
        if (list == null) {
            OooOOO0.OooOOOO("noteEditorList");
            throw null;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            View view = (View) obj;
            if (new RectF(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight()).contains(f, f2)) {
                return Integer.valueOf(i);
            }
            i = i2;
        }
        return null;
    }

    public static /* synthetic */ void getLayoutType$annotations() {
    }

    public final void OooO0O0(int i, float f) {
        if (this.layoutType != i) {
            this.layoutType = i;
            androidx.constraintlayout.widget.OooO0OO oooO0OO = new androidx.constraintlayout.widget.OooO0OO();
            oooO0OO.OooO0o0(this);
            if (i == 0) {
                View view = this.f76970OooOo0o;
                if (view == null) {
                    OooOOO0.OooOOOO("editorA");
                    throw null;
                }
                oooO0OO.OooO0o(view.getId(), 1, 0, 1);
                View view2 = this.f76970OooOo0o;
                if (view2 == null) {
                    OooOOO0.OooOOOO("editorA");
                    throw null;
                }
                oooO0OO.OooO0o(view2.getId(), 2, 0, 2);
                View view3 = this.f76970OooOo0o;
                if (view3 == null) {
                    OooOOO0.OooOOOO("editorA");
                    throw null;
                }
                oooO0OO.OooO0o(view3.getId(), 3, 0, 3);
                View view4 = this.f76970OooOo0o;
                if (view4 == null) {
                    OooOOO0.OooOOOO("editorA");
                    throw null;
                }
                oooO0OO.OooO0o(view4.getId(), 4, 0, 4);
                View view5 = this.f76969OooOo;
                if (view5 == null) {
                    OooOOO0.OooOOOO("editorB");
                    throw null;
                }
                oooO0OO.OooO0o(view5.getId(), 2, 0, 2);
                View view6 = this.f76969OooOo;
                if (view6 == null) {
                    OooOOO0.OooOOOO("editorB");
                    throw null;
                }
                oooO0OO.OooO0o(view6.getId(), 1, 0, 1);
                View view7 = this.f76969OooOo;
                if (view7 == null) {
                    OooOOO0.OooOOOO("editorB");
                    throw null;
                }
                oooO0OO.OooO0o(view7.getId(), 3, 0, 3);
                View view8 = this.f76969OooOo;
                if (view8 == null) {
                    OooOOO0.OooOOOO("editorB");
                    throw null;
                }
                oooO0OO.OooO0o(view8.getId(), 4, 0, 4);
            } else if (i == 1) {
                View view9 = this.f76970OooOo0o;
                if (view9 == null) {
                    OooOOO0.OooOOOO("editorA");
                    throw null;
                }
                oooO0OO.OooO0o(view9.getId(), 3, 0, 3);
                View view10 = this.f76970OooOo0o;
                if (view10 == null) {
                    OooOOO0.OooOOOO("editorA");
                    throw null;
                }
                int id = view10.getId();
                View view11 = this.f76976OooOooO;
                if (view11 == null) {
                    OooOOO0.OooOOOO("dividerH");
                    throw null;
                }
                oooO0OO.OooO0o(id, 4, view11.getId(), 3);
                View view12 = this.f76970OooOo0o;
                if (view12 == null) {
                    OooOOO0.OooOOOO("editorA");
                    throw null;
                }
                oooO0OO.OooO0o(view12.getId(), 1, 0, 1);
                View view13 = this.f76970OooOo0o;
                if (view13 == null) {
                    OooOOO0.OooOOOO("editorA");
                    throw null;
                }
                oooO0OO.OooO0o(view13.getId(), 2, 0, 2);
                View view14 = this.f76969OooOo;
                if (view14 == null) {
                    OooOOO0.OooOOOO("editorB");
                    throw null;
                }
                oooO0OO.OooO0o(view14.getId(), 1, 0, 1);
                View view15 = this.f76969OooOo;
                if (view15 == null) {
                    OooOOO0.OooOOOO("editorB");
                    throw null;
                }
                oooO0OO.OooO0o(view15.getId(), 2, 0, 2);
                View view16 = this.f76969OooOo;
                if (view16 == null) {
                    OooOOO0.OooOOOO("editorB");
                    throw null;
                }
                oooO0OO.OooO0o(view16.getId(), 4, 0, 4);
                View view17 = this.f76969OooOo;
                if (view17 == null) {
                    OooOOO0.OooOOOO("editorB");
                    throw null;
                }
                int id2 = view17.getId();
                View view18 = this.f76976OooOooO;
                if (view18 == null) {
                    OooOOO0.OooOOOO("dividerH");
                    throw null;
                }
                oooO0OO.OooO0o(id2, 3, view18.getId(), 4);
            } else if (i == 2) {
                View view19 = this.f76970OooOo0o;
                if (view19 == null) {
                    OooOOO0.OooOOOO("editorA");
                    throw null;
                }
                oooO0OO.OooO0o(view19.getId(), 1, 0, 1);
                View view20 = this.f76970OooOo0o;
                if (view20 == null) {
                    OooOOO0.OooOOOO("editorA");
                    throw null;
                }
                int id3 = view20.getId();
                View view21 = this.f76971OooOoO;
                if (view21 == null) {
                    OooOOO0.OooOOOO("dividerV");
                    throw null;
                }
                oooO0OO.OooO0o(id3, 2, view21.getId(), 1);
                View view22 = this.f76970OooOo0o;
                if (view22 == null) {
                    OooOOO0.OooOOOO("editorA");
                    throw null;
                }
                oooO0OO.OooO0o(view22.getId(), 3, 0, 3);
                View view23 = this.f76970OooOo0o;
                if (view23 == null) {
                    OooOOO0.OooOOOO("editorA");
                    throw null;
                }
                oooO0OO.OooO0o(view23.getId(), 4, 0, 4);
                View view24 = this.f76969OooOo;
                if (view24 == null) {
                    OooOOO0.OooOOOO("editorB");
                    throw null;
                }
                oooO0OO.OooO0o(view24.getId(), 2, 0, 2);
                View view25 = this.f76969OooOo;
                if (view25 == null) {
                    OooOOO0.OooOOOO("editorB");
                    throw null;
                }
                int id4 = view25.getId();
                View view26 = this.f76971OooOoO;
                if (view26 == null) {
                    OooOOO0.OooOOOO("dividerV");
                    throw null;
                }
                oooO0OO.OooO0o(id4, 1, view26.getId(), 2);
                View view27 = this.f76969OooOo;
                if (view27 == null) {
                    OooOOO0.OooOOOO("editorB");
                    throw null;
                }
                oooO0OO.OooO0o(view27.getId(), 3, 0, 3);
                View view28 = this.f76969OooOo;
                if (view28 == null) {
                    OooOOO0.OooOOOO("editorB");
                    throw null;
                }
                oooO0OO.OooO0o(view28.getId(), 4, 0, 4);
            }
            View view29 = this.f76970OooOo0o;
            if (view29 == null) {
                OooOOO0.OooOOOO("editorA");
                throw null;
            }
            oooO0OO.OooOOo(view29.getId(), 1.0f);
            View view30 = this.f76970OooOo0o;
            if (view30 == null) {
                OooOOO0.OooOOOO("editorA");
                throw null;
            }
            oooO0OO.OooOO0(view30.getId()).f64014OooO0o0.f64033OooO0OO = 0;
            View view31 = this.f76970OooOo0o;
            if (view31 == null) {
                OooOOO0.OooOOOO("editorA");
                throw null;
            }
            oooO0OO.OooOO0(view31.getId()).f64014OooO0o0.f64034OooO0Oo = 0;
            View view32 = this.f76969OooOo;
            if (view32 == null) {
                OooOOO0.OooOOOO("editorB");
                throw null;
            }
            oooO0OO.OooOOo(view32.getId(), 1.0f);
            View view33 = this.f76969OooOo;
            if (view33 == null) {
                OooOOO0.OooOOOO("editorB");
                throw null;
            }
            oooO0OO.OooOO0(view33.getId()).f64014OooO0o0.f64033OooO0OO = 0;
            View view34 = this.f76969OooOo;
            if (view34 == null) {
                OooOOO0.OooOOOO("editorB");
                throw null;
            }
            oooO0OO.OooOO0(view34.getId()).f64014OooO0o0.f64034OooO0Oo = 0;
            View view35 = this.f76971OooOoO;
            if (view35 == null) {
                OooOOO0.OooOOOO("dividerV");
                throw null;
            }
            oooO0OO.OooO0o(view35.getId(), 1, 0, 1);
            View view36 = this.f76971OooOoO;
            if (view36 == null) {
                OooOOO0.OooOOOO("dividerV");
                throw null;
            }
            oooO0OO.OooO0o(view36.getId(), 2, 0, 2);
            View view37 = this.f76971OooOoO;
            if (view37 == null) {
                OooOOO0.OooOOOO("dividerV");
                throw null;
            }
            oooO0OO.OooOO0(view37.getId()).f64014OooO0o0.f64049OooOo = f;
            View view38 = this.f76976OooOooO;
            if (view38 == null) {
                OooOOO0.OooOOOO("dividerH");
                throw null;
            }
            oooO0OO.OooO0o(view38.getId(), 3, 0, 3);
            View view39 = this.f76976OooOooO;
            if (view39 == null) {
                OooOOO0.OooOOOO("dividerH");
                throw null;
            }
            oooO0OO.OooO0o(view39.getId(), 4, 0, 4);
            View view40 = this.f76976OooOooO;
            if (view40 == null) {
                OooOOO0.OooOOOO("dividerH");
                throw null;
            }
            oooO0OO.OooOO0(view40.getId()).f64014OooO0o0.f64055OooOoO0 = f;
            oooO0OO.OooO0O0(this);
            TransitionManager.beginDelayedTransition(this);
        }
        OooO0OO();
        int i2 = this.layoutType;
        if (i2 == 0) {
            View view41 = this.f76971OooOoO;
            if (view41 == null) {
                OooOOO0.OooOOOO("dividerV");
                throw null;
            }
            view41.setVisibility(8);
            View view42 = this.f76976OooOooO;
            if (view42 == null) {
                OooOOO0.OooOOOO("dividerH");
                throw null;
            }
            view42.setVisibility(8);
            List<? extends View> list = this.f76972OooOoO0;
            if (list == null) {
                OooOOO0.OooOOOO("noteEditorList");
                throw null;
            }
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                View view43 = (View) obj;
                if (i3 == this.f76978Oooo0) {
                    view43.setVisibility(0);
                } else {
                    view43.setVisibility(4);
                }
                i3 = i4;
            }
            return;
        }
        if (i2 == 1) {
            View view44 = this.f76971OooOoO;
            if (view44 == null) {
                OooOOO0.OooOOOO("dividerV");
                throw null;
            }
            view44.setVisibility(8);
            View view45 = this.f76976OooOooO;
            if (view45 == null) {
                OooOOO0.OooOOOO("dividerH");
                throw null;
            }
            view45.setVisibility(0);
            List<? extends View> list2 = this.f76972OooOoO0;
            if (list2 == null) {
                OooOOO0.OooOOOO("noteEditorList");
                throw null;
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(0);
            }
            return;
        }
        if (i2 != 2) {
            return;
        }
        View view46 = this.f76971OooOoO;
        if (view46 == null) {
            OooOOO0.OooOOOO("dividerV");
            throw null;
        }
        view46.setVisibility(0);
        View view47 = this.f76976OooOooO;
        if (view47 == null) {
            OooOOO0.OooOOOO("dividerH");
            throw null;
        }
        view47.setVisibility(8);
        List<? extends View> list3 = this.f76972OooOoO0;
        if (list3 == null) {
            OooOOO0.OooOOOO("noteEditorList");
            throw null;
        }
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setVisibility(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0OO() {
        List<? extends View> list = this.f76972OooOoO0;
        if (list == null) {
            OooOOO0.OooOOOO("noteEditorList");
            throw null;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            View view = (View) obj;
            boolean z = true;
            boolean z2 = i == this.f76978Oooo0 && this.layoutType != 0;
            if (i != this.f76982Oooo0O0) {
                z = false;
            } else if (this.layoutType == 0) {
                Context context = getContext();
                OooOOO0.OooO0o(context, "getContext(...)");
                if (!C28038OooO0Oo.OooO0O0(context)) {
                }
            }
            if (z2 && z) {
                Context context2 = getContext();
                view.setForeground(context2 != null ? context2.getDrawable(R.drawable.bg_split_screen_preview_foucsed) : null);
            } else if (z2) {
                Context context3 = getContext();
                view.setForeground(context3 != null ? context3.getDrawable(R.drawable.bg_note_editor_focused) : null);
            } else if (z) {
                Context context4 = getContext();
                view.setForeground(context4 != null ? context4.getDrawable(R.drawable.bg_split_screen_preview_normal) : null);
            } else {
                view.setForeground(null);
            }
            i = i2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            if (motionEvent.getToolType(0) == 1 && motionEvent.getX() < 10.0f) {
                return super.dispatchTouchEvent(motionEvent);
            }
            List<? extends View> list = this.f76972OooOoO0;
            if (list == null) {
                OooOOO0.OooOOOO("noteEditorList");
                throw null;
            }
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                View view = (View) obj;
                if (view.getVisibility() == 0 && new RectF(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight()).contains(motionEvent.getX(), motionEvent.getY()) && this.f76978Oooo0 != i) {
                    setFocusedEditorIndex(i);
                }
                i = i2;
            }
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteEditorContainer");
            c20358OooO00o.OooO0Oo(e, "NoteEditorContainer.dispatchTouchEvent err.", new Object[0]);
            return false;
        }
    }

    public final int getLayoutType() {
        return this.layoutType;
    }

    public final Float getScreenIndicatorBias() {
        androidx.constraintlayout.widget.OooO0OO oooO0OO = new androidx.constraintlayout.widget.OooO0OO();
        oooO0OO.OooO0o0(this);
        int i = this.layoutType;
        if (i == 1) {
            View view = this.f76976OooOooO;
            if (view != null) {
                return Float.valueOf(oooO0OO.OooOO0O(view.getId()).f64014OooO0o0.f64055OooOoO0);
            }
            OooOOO0.OooOOOO("dividerH");
            throw null;
        }
        if (i != 2) {
            return null;
        }
        View view2 = this.f76971OooOoO;
        if (view2 != null) {
            return Float.valueOf(oooO0OO.OooOO0O(view2.getId()).f64014OooO0o0.f64049OooOo);
        }
        OooOOO0.OooOOOO("dividerV");
        throw null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f76970OooOo0o = findViewById(R.id.note_editor_1);
        View viewFindViewById = findViewById(R.id.note_editor_2);
        this.f76969OooOo = viewFindViewById;
        View view = this.f76970OooOo0o;
        if (view == null) {
            OooOOO0.OooOOOO("editorA");
            throw null;
        }
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("editorB");
            throw null;
        }
        this.f76972OooOoO0 = C34429OooOOo0.OooOO0o(view, viewFindViewById);
        this.f76971OooOoO = findViewById(R.id.divider_v);
        this.f76976OooOooO = findViewById(R.id.divider_h);
        View viewFindViewById2 = findViewById(R.id.drag_indicator_v);
        this.f76973OooOoOO = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("dragIndicatorV");
            throw null;
        }
        viewFindViewById2.setOnTouchListener(new OooO0OO());
        View viewFindViewById3 = findViewById(R.id.drag_indicator_h);
        this.f76977OooOooo = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("dragIndicatorH");
            throw null;
        }
        viewFindViewById3.setOnTouchListener(new OooO0OO());
        View viewFindViewById4 = findViewById(R.id.btn_switch_note_v);
        OooOOO0.OooO0Oo(viewFindViewById4);
        C28050OooO0OO.OooO00o(viewFindViewById4, 1000L, new ViewOnClickListenerC29610OooO00o(this, 1));
        this.f76975OooOoo0 = viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.btn_switch_orientation_v);
        OooOOO0.OooO0Oo(viewFindViewById5);
        int i = 2;
        C28050OooO0OO.OooO00o(viewFindViewById5, 1000L, new ViewOnClickListenerC28157OooOO0O(this, i));
        this.f76974OooOoo = viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.btn_switch_note_h);
        OooOOO0.OooO0Oo(viewFindViewById6);
        C28050OooO0OO.OooO00o(viewFindViewById6, 1000L, new ViewOnClickListenerC29029OoooO00(this, i));
        this.f76979Oooo000 = viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.btn_switch_orientation_h);
        OooOOO0.OooO0Oo(viewFindViewById7);
        C28050OooO0OO.OooO00o(viewFindViewById7, 1000L, new ViewOnClickListenerC28158OooOO0o(this, 4));
        this.f76980Oooo00O = viewFindViewById7;
        setOnDragListener(new OooO0O0());
    }

    public final void setEditorContainerEventListener(OooO00o listener) {
        OooOOO0.OooO0oO(listener, "listener");
        this.f76983Oooo0OO = listener;
    }

    public final void setFocusedEditorIndex(int editorIndex) {
        if (this.f76978Oooo0 == editorIndex) {
            return;
        }
        this.f76978Oooo0 = editorIndex;
        OooO00o oooO00o = this.f76983Oooo0OO;
        if (oooO00o != null) {
            oooO00o.OooO0OO(editorIndex);
        }
        OooO0OO();
    }
}
