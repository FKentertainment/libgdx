/*******************************************************************************
 * Copyright 2012 David Saltares
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/ 

package com.badlogic.gdx.gleed;

import com.badlogic.gdx.graphics.OrthographicCamera;

/**
 * @author David Saltares
 * @date 03/11/2012
 *
 * @brief GLEED2D level render interface
 */
public interface ILevelRenderer {
	/**
	 * Renders every TextureElement in the level 
	 * 
	 * @param camera camera to render the level
	 */
	public void render(OrthographicCamera camera);
	
	/**
	 * Renders every TextureElement in the selected layers
	 *  
	 * @param camera camera to render the level
	 * @param layers selected layers
	 */
	public void render(OrthographicCamera camera, int[] layers);
}
