package com.microsoft.identity.common.java.controllers;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, m80612d2 = {"Lcom/microsoft/identity/common/java/controllers/IControllerFactory;", "", "getAllControllers", "", "Lcom/microsoft/identity/common/java/controllers/BaseController;", "getDefaultController", "common4j"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public interface IControllerFactory {
    List<BaseController> getAllControllers();

    BaseController getDefaultController();
}
