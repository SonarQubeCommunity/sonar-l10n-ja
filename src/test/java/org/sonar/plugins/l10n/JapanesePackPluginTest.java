/*
 * L10n :: Japanese Pack
 * Copyright (C) 2012 Yoshiyuki NISHINAKA
 * yoshiyuki.nishinaka@gmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.plugins.l10n;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.sonar.test.i18n.I18nMatchers.assertAllBundlesUpToDate;

public class JapanesePackPluginTest {

  /**
   * Version of Sonar which is covered by the language pack
   */
  private static final String SONAR_VERSION = "3.2";

  /**
   * Bundles of the forge plugins covered by the language pack
   */

  private static final Map<String, String> pluginIdsToBundleUrlMap = new HashMap<String, String>() {
    {
      // put here the forge plugins covered by this language pack
    }
  };

  @Test
  public void test() throws Exception {
    assertAllBundlesUpToDate(SONAR_VERSION, pluginIdsToBundleUrlMap);
  }

}
