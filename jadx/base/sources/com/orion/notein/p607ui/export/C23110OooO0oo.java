package com.orion.notein.p607ui.export;

import OooOoO.C20504OooO0O0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.export.AddWaterMarkFragment;
import com.orion.notein.p607ui.export.C23110OooO0oo;
import com.orion.penkit.models.DelegateAdapter;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C24023OooOOoo;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.o0OO00O;
import o0Oo0o0o.C28230OooO0oO;
import o0Oo0o0o.oo000o;
import oO00ooO.C32442OooOO0o;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: com.orion.notein.ui.export.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23110OooO0oo extends RecyclerView.AbstractC22062OooO0oO<OooO0O0> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f71792OooO0Oo = {C24035Oooo00o.f80943OooO00o.OooO0o0(new C24023OooOOoo(C23110OooO0oo.class, "listState", "getListState()Lcom/orion/notein/ui/export/WaterMarkAdapter$WaterMarkState;", 0))};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<String> f71793OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final WeakReference<AddWaterMarkFragment> f71794OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0OO f71795OooO0OO;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: com.orion.notein.ui.export.OooO0oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f71796OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final C19210OooO00o f71797OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO00o f71798OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f71799OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO00o f71800OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f71801OooOoo0;

        /* JADX INFO: renamed from: com.orion.notein.ui.export.OooO0oo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19210OooO00o {
            public static OooO00o OooO00o(int i) {
                for (OooO00o oooO00o : OooO00o.values()) {
                    if (oooO00o.ordinal() == i) {
                        return oooO00o;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

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
                com.orion.notein.ui.export.OooO0oo$OooO00o r0 = new com.orion.notein.ui.export.OooO0oo$OooO00o
                java.lang.String r1 = "NON_VIP"
                r2 = 0
                r0.<init>(r1, r2)
                com.orion.notein.p607ui.export.C23110OooO0oo.OooO00o.f71796OooOo = r0
                com.orion.notein.ui.export.OooO0oo$OooO00o r1 = new com.orion.notein.ui.export.OooO0oo$OooO00o
                java.lang.String r2 = "DEFAULT"
                r3 = 1
                r1.<init>(r2, r3)
                com.orion.notein.p607ui.export.C23110OooO0oo.OooO00o.f71799OooOoO0 = r1
                com.orion.notein.ui.export.OooO0oo$OooO00o r2 = new com.orion.notein.ui.export.OooO0oo$OooO00o
                java.lang.String r3 = "EMPTY"
                r4 = 2
                r2.<init>(r3, r4)
                com.orion.notein.p607ui.export.C23110OooO0oo.OooO00o.f71798OooOoO = r2
                com.orion.notein.ui.export.OooO0oo$OooO00o r3 = new com.orion.notein.ui.export.OooO0oo$OooO00o
                java.lang.String r4 = "CUSTOM"
                r5 = 3
                r3.<init>(r4, r5)
                com.orion.notein.p607ui.export.C23110OooO0oo.OooO00o.f71800OooOoOO = r3
                com.orion.notein.ui.export.OooO0oo$OooO00o[] r0 = new com.orion.notein.p607ui.export.C23110OooO0oo.OooO00o[]{r0, r1, r2, r3}
                com.orion.notein.p607ui.export.C23110OooO0oo.OooO00o.f71801OooOoo0 = r0
                java.lang.Object.<init>()
                com.orion.notein.ui.export.OooO0oo$OooO00o$OooO00o r0 = new com.orion.notein.ui.export.OooO0oo$OooO00o$OooO00o
                r0.<init>()
                com.orion.notein.p607ui.export.C23110OooO0oo.OooO00o.f71797OooOo0o = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.p607ui.export.C23110OooO0oo.OooO00o.<clinit>():void");
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f71801OooOoo0.clone();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.export.OooO0oo$OooO0O0 */
    public static final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f71802OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ImageView f71803OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f71804OooO0OO;

        public OooO0O0(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.imgv_selected);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f71802OooO00o = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.imgv_edit);
            OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            this.f71803OooO0O0 = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.tv_name);
            OooOOO0.OooO0o(viewFindViewById3, "findViewById(...)");
            this.f71804OooO0OO = (TextView) viewFindViewById3;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.export.OooO0oo$OooO0OO */
    public static final class OooO0OO extends oO0O00o0.OooO00o<OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ C23110OooO0oo f71805OooO00o;

        /* JADX WARN: Illegal instructions before constructor call */
        public OooO0OO(C23110OooO0oo c23110OooO0oo) {
            OooO00o oooO00o = OooO00o.f71796OooOo;
            this.f71805OooO00o = c23110OooO0oo;
            super(oooO00o);
        }

        @Override // oO0O00o0.OooO00o
        public final void afterChange(InterfaceC34602OooOO0o<?> property, OooO00o oooO00o, OooO00o oooO00o2) {
            OooOOO0.OooO0oO(property, "property");
            C28230OooO0oO.OooO00o("Add water mark list state changed: " + oooO00o2 + ".");
            this.f71805OooO00o.notifyDataSetChanged();
        }
    }

    public C23110OooO0oo(List<String> list, WeakReference<AddWaterMarkFragment> weakReference) {
        this.f71793OooO00o = list;
        this.f71794OooO0O0 = weakReference;
        DelegateAdapter delegateAdapter = DelegateAdapter.INSTANCE;
        OooO00o.C19210OooO00o c19210OooO00o = OooO00o.f71797OooOo0o;
        this.f71795OooO0OO = new OooO0OO(this);
    }

    public static final void OooO0OO(ImageView imageView, ImageView imageView2, ViewGroup viewGroup, boolean z) {
        imageView.setVisibility(z ? 0 : 8);
        imageView2.setVisibility(8);
        viewGroup.setBackground(z ? ContextCompat.getDrawable(viewGroup.getContext(), R.drawable.item_bg_pressed) : ContextCompat.getDrawable(viewGroup.getContext(), R.drawable.list_item_bg_selector));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemCount() {
        return this.f71793OooO00o.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, final int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        InterfaceC34602OooOO0o<?>[] interfaceC34602OooOO0oArr = f71792OooO0Oo;
        InterfaceC34602OooOO0o<?> interfaceC34602OooOO0o = interfaceC34602OooOO0oArr[0];
        OooO0OO oooO0OO = this.f71795OooO0OO;
        C28230OooO0oO.OooO00o("Water adapter onBind, pos: " + i + ", state: " + oooO0OO.getValue(this, interfaceC34602OooOO0o) + ".");
        View view = holder.itemView;
        OooOOO0.OooO0o0(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        int iOrdinal = oooO0OO.getValue(this, interfaceC34602OooOO0oArr[0]).ordinal();
        ImageView imageView = holder.f71802OooO00o;
        ImageView imageView2 = holder.f71803OooO0O0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                imageView.setImageResource(R.drawable.ic_ni_choose);
                OooO0OO(imageView, imageView2, viewGroup, i == 0);
                holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o0Oo0o0o.o00oO0o
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        AddWaterMarkFragment addWaterMarkFragment = this.f100294OooOo0o.f71794OooO0O0.get();
                        if (addWaterMarkFragment != null) {
                            com.orion.notein.p607ui.export.OooO0O0 oooO0O0 = (com.orion.notein.p607ui.export.OooO0O0) addWaterMarkFragment.f71504OooOooO.getValue();
                            C23110OooO0oo.OooO00o.C19210OooO00o c19210OooO00o = C23110OooO0oo.OooO00o.f71797OooOo0o;
                            int i2 = i + 1;
                            c19210OooO00o.getClass();
                            oooO0O0.OooO0o0(C23110OooO0oo.OooO00o.C19210OooO00o.OooO00o(i2));
                        }
                    }
                });
            } else if (iOrdinal == 2) {
                imageView.setImageResource(R.drawable.ic_ni_choose);
                OooO0OO(imageView, imageView2, viewGroup, i == 1);
                holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o0Oo0o0o.o00oO0O
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        AddWaterMarkFragment addWaterMarkFragment = this.f100292OooOo0o.f71794OooO0O0.get();
                        if (addWaterMarkFragment != null) {
                            com.orion.notein.p607ui.export.OooO0O0 oooO0O0 = (com.orion.notein.p607ui.export.OooO0O0) addWaterMarkFragment.f71504OooOooO.getValue();
                            C23110OooO0oo.OooO00o.C19210OooO00o c19210OooO00o = C23110OooO0oo.OooO00o.f71797OooOo0o;
                            int i2 = i + 1;
                            c19210OooO00o.getClass();
                            oooO0O0.OooO0o0(C23110OooO0oo.OooO00o.C19210OooO00o.OooO00o(i2));
                        }
                    }
                });
            } else {
                if (iOrdinal != 3) {
                    throw new C32442OooOO0o();
                }
                imageView.setImageResource(R.drawable.ic_ni_choose);
                OooO0OO(imageView, imageView2, viewGroup, i == 2);
                imageView2.setVisibility(i != 2 ? 8 : 0);
                imageView2.setOnClickListener(new o0OO00O(this, 1));
                holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o0Oo0o0o.o0ooOO0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        AddWaterMarkFragment addWaterMarkFragment = this.f100300OooOo0o.f71794OooO0O0.get();
                        if (addWaterMarkFragment != null) {
                            com.orion.notein.p607ui.export.OooO0O0 oooO0O0 = (com.orion.notein.p607ui.export.OooO0O0) addWaterMarkFragment.f71504OooOooO.getValue();
                            C23110OooO0oo.OooO00o.C19210OooO00o c19210OooO00o = C23110OooO0oo.OooO00o.f71797OooOo0o;
                            int i2 = i + 1;
                            c19210OooO00o.getClass();
                            oooO0O0.OooO0o0(C23110OooO0oo.OooO00o.C19210OooO00o.OooO00o(i2));
                        }
                    }
                });
            }
        } else if (i == 0) {
            OooO0OO(imageView, imageView2, viewGroup, true);
        } else {
            imageView.setImageResource(R.drawable.ic_ni_vip);
            viewGroup.setOnClickListener(new oo000o(this, 0));
        }
        holder.f71804OooO0OO.setText(this.f71793OooO00o.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_add_water_mark, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(viewOooO0OO);
    }
}
