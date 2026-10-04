package androidx.core.view;

import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21987OooOoo;

/* JADX INFO: loaded from: classes.dex */
public interface MenuHost {
    void addMenuProvider(MenuProvider menuProvider);

    void addMenuProvider(MenuProvider menuProvider, InterfaceC21987OooOoo interfaceC21987OooOoo);

    void addMenuProvider(MenuProvider menuProvider, InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO0O0 oooO0O0);

    void invalidateMenu();

    void removeMenuProvider(MenuProvider menuProvider);
}
