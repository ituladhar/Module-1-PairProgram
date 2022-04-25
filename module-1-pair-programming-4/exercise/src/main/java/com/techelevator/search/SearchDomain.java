package com.techelevator.search;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * The Search Domain is a list of files to be read and indexed by the Search Engine.
 *
 * Folders are NOT recursively searched.
 */
public class SearchDomain {

	private String folder;
	private List<String> files;

	/**
	 * Create a Search Domain of a folder
	 *
	 * @param folder
	 * @throws SearchDomainException
	 */
	public SearchDomain(String folder) throws SearchDomainException {
		this.folder = folder;
		this.files = buildDomain();
	}

	public String getFolder() {
		return folder;
	}

	public List<String> getFiles() {
		return files;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (String file : files) {
			sb.append(file);
			sb.append("\n");
		}
		return sb.toString();
	}

	/**
	 * Folders are NOT recursively searched.
	 *
	 * @return
	 * @throws SearchDomainException
	 */
	private List<String> buildDomain() throws SearchDomainException {
		List<String> files = new ArrayList<>();
		// Step Three: Complete the buildDomain method
		File dataFolder = new File("exercise/data");
		try {
			if (dataFolder.isDirectory()) {
				for (File file : dataFolder.listFiles()) {
					if (file.isFile()) {
					    //files.add(file.getName());
						files.add(file.toString());
						System.out.println(file);
					}
				}
			}
		}catch (Exception e){
			throw new SearchDomainException("ERROR: Folder " + folder + "is not found.");

		}

		return files;
	}

}

/*		File folderToBuildFrom = new File(this.folder);

		if(folderToBuildFrom.exists() && folderToBuildFrom.isDirectory()){
			File[] filesInDir = folderToBuildFrom.listFiles();
			for(int i = 0; i < filesInDir.length; i++){
				String fileNames = filesInDir[i].getName();
				String folderPath = this.folder+ "/" + fileNames;
				files.add(folderPath);
			}
		}else{
			new SearchDomainException(this.folder + "Does not exist");
		}



		return files;
	}

}*/
