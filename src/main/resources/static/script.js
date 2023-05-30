//const dogsContainer = document.getElementById('dogs-container');
//
//// Fetch all dogs
//fetch('/api/dogs')
//  .then(response => response.json())
//  .then(dogs => {
//    displayDogs(dogs);
//  })
//  .catch(error => {
//    console.error('Error:', error);
//  });
//
//// Function to display the dogs
//function displayDogs(dogs) {
//  dogsContainer.innerHTML = '';
//
//  dogs.forEach(dog => {
//    const dogCard = createDogCard(dog);
//    dogsContainer.appendChild(dogCard);
//  });
//}
//
//// Function to create a dog card element
//function createDogCard(dog) {
//  const dogCard = document.createElement('div');
//  dogCard.className = 'dog-card';
//
//  const dogName = document.createElement('h2');
//  dogName.textContent = dog.name;
//  dogCard.appendChild(dogName);
//
//  const dogBreed = document.createElement('p');
//  dogBreed.textContent = `Breed: ${dog.breed}`;
//  dogCard.appendChild(dogBreed);
//
//  const dogAge = document.createElement('p');
//  dogAge.textContent = `Age: ${dog.age}`;
//  dogCard.appendChild(dogAge);
//
//  return dogCard;
//}

