/*
 * Copyright (C) 2012 ZXing authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tiqr.authenticator.qr.camera.exposure;

import org.tiqr.authenticator.qr.common.PlatformSupportManager;

public final class ExposureManager extends PlatformSupportManager<ExposureInterface> {

    public ExposureManager() {
        super(ExposureInterface.class, new DefaultExposureInterface());
        addImplementationClass(8, "org.tiqr.authenticator.qr.camera.exposure.FroyoExposureInterface");
    }

}
