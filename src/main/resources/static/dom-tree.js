// function generateDogs() {
//      const selectedSkills = Array.from(document.getElementById('skills').selectedOptions).map(option => option.value);
//
//      const dogs = [
//        {
//          breed: 'Bulldog',
//          image: 'Bulldog_inglese.jpg',
//          traits: ['Friendly', 'Calm', 'Protective'],
//          skills: ['guarding', 'obedience']
//        },
//        {
//          breed: 'Labrador Retriever',
//          image: 'Article_Allergies_LabradorRetrievers.jpg',
//          traits: ['Intelligent', 'Friendly', 'Energetic'],
//          skills: ['retrieving', 'assistance']
//        },
//        {
//          breed: 'German Shepherd',
//          image: 'Article_Allergies_GermanShepherds.jpg',
//          traits: ['Loyal', 'Courageous', 'Intelligent'],
//          skills: ['tracking', 'protection']
//        },
//        {
//          breed: 'Poodle',
//          image: 'istockphoto-520646148-612x612.jpg',
//          traits: ['Intelligent', 'Active', 'Elegant'],
//          skills: ['agility', 'obedience']
//        },
//        {
//          breed: 'Golden Retriever',
//          image: 'golden-retriever_Shutterstock.jpg',
//          traits: ['Friendly', 'Intelligent', 'Gentle'],
//          skills: ['therapy', 'rescue']
//        }
//      ];
//
//      const matchingDogs = dogs.filter(dog => selectedSkills.every(skill => dog.skills.includes(skill)));
//
//      const dogsContainer = document.getElementById('dogs-container');
//      dogsContainer.innerHTML = '';
//
//      matchingDogs.forEach(dog => {
//        const dogCard = document.createElement('div');
//        dogCard.className = 'dog-card';
//
//        const heading = document.createElement('h2');
//        heading.textContent = dog.breed;
//        dogCard.appendChild(heading);
//
//        const image = document.createElement('img');
//        image.className = 'dog-image';
//        image.src = dog.image;
//        image.alt = dog.breed;
//        dogCard.appendChild(image);
//
//        const traits = document.createElement('p');
//        traits.textContent = 'Traits: ' + dog.traits.join(', ');
//        dogCard.appendChild(traits);
//
//        const skills = document.createElement('p');
//        skills.textContent = 'Skills: ' + dog.skills.join(', ');
//        dogCard.appendChild(skills);
//
//        dogsContainer.appendChild(dogCard);
//      });
//    }
