package com.orion.notein.p607ui.label;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.ContextCompat;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0o00.ViewOnClickListenerC28191OoooO00;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR0\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m80612d2 = {"Lcom/orion/notein/ui/label/TriStateCheckBox;", "Landroidx/appcompat/widget/AppCompatCheckBox;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/orion/notein/ui/label/TriStateCheckBox$OooO00o;", "value", "OooOo0o", "Lcom/orion/notein/ui/label/TriStateCheckBox$OooO00o;", "getState", "()Lcom/orion/notein/ui/label/TriStateCheckBox$OooO00o;", "setState", "(Lcom/orion/notein/ui/label/TriStateCheckBox$OooO00o;)V", "state", "Lkotlin/Function1;", "LoO00ooO/OooOooO;", "OooOo", "LoO0O000o/OooOO0o;", "getOnStateChange", "()LoO0O000o/OooOO0o;", "setOnStateChange", "(LoO0O000o/OooOO0o;)V", "onStateChange", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TriStateCheckBox extends AppCompatCheckBox {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name and from kotlin metadata */
    public InterfaceC32507OooOO0o<? super OooO00o, C32460OooOooO> onStateChange;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name and from kotlin metadata */
    public OooO00o state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f72097OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f72098OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f72099OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f72100OooOoO0;

        /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
            java.lang.IllegalArgumentException: Illegal Capacity: -1
            	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
            	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
            	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        static {
            /*
                com.orion.notein.ui.label.TriStateCheckBox$OooO00o r0 = new com.orion.notein.ui.label.TriStateCheckBox$OooO00o
                java.lang.String r1 = "CHECKED"
                r2 = 0
                r0.<init>(r1, r2)
                com.orion.notein.ui.label.TriStateCheckBox.OooO00o.f72098OooOo0o = r0
                com.orion.notein.ui.label.TriStateCheckBox$OooO00o r1 = new com.orion.notein.ui.label.TriStateCheckBox$OooO00o
                java.lang.String r2 = "INDETERMINATE"
                r3 = 1
                r1.<init>(r2, r3)
                com.orion.notein.ui.label.TriStateCheckBox.OooO00o.f72097OooOo = r1
                com.orion.notein.ui.label.TriStateCheckBox$OooO00o r2 = new com.orion.notein.ui.label.TriStateCheckBox$OooO00o
                java.lang.String r3 = "UNCHECKED"
                r4 = 2
                r2.<init>(r3, r4)
                com.orion.notein.ui.label.TriStateCheckBox.OooO00o.f72100OooOoO0 = r2
                com.orion.notein.ui.label.TriStateCheckBox$OooO00o[] r0 = new com.orion.notein.ui.label.TriStateCheckBox.OooO00o[]{r0, r1, r2}
                com.orion.notein.ui.label.TriStateCheckBox.OooO00o.f72099OooOoO = r0
                java.lang.Object.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.ui.label.TriStateCheckBox.OooO00o.<clinit>():void");
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f72099OooOoO.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriStateCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(attrs, "attrs");
        this.state = OooO00o.f72100OooOoO0;
        OooO00o();
        setOnClickListener(new ViewOnClickListenerC28191OoooO00(this, 1));
    }

    public final void OooO00o() {
        int iOrdinal = this.state.ordinal();
        if (iOrdinal == 0) {
            setChecked(true);
            setButtonDrawable(ContextCompat.getDrawable(getContext(), R.drawable.ic_tri_state_checkbox_checked));
        } else if (iOrdinal == 1) {
            setChecked(false);
            setButtonDrawable(ContextCompat.getDrawable(getContext(), R.drawable.ic_tri_state_checkbox_indeterminate));
        } else {
            if (iOrdinal != 2) {
                throw new C32442OooOO0o();
            }
            setChecked(false);
            setButtonDrawable(ContextCompat.getDrawable(getContext(), R.drawable.ic_tri_state_checkbox_unchecked));
        }
    }

    public final InterfaceC32507OooOO0o<OooO00o, C32460OooOooO> getOnStateChange() {
        return this.onStateChange;
    }

    public final OooO00o getState() {
        return this.state;
    }

    public final void setOnStateChange(InterfaceC32507OooOO0o<? super OooO00o, C32460OooOooO> interfaceC32507OooOO0o) {
        this.onStateChange = interfaceC32507OooOO0o;
    }

    public final void setState(OooO00o value) {
        OooOOO0.OooO0oO(value, "value");
        if (this.state == value) {
            return;
        }
        this.state = value;
        OooO00o();
    }
}
